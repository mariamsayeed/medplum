import { Grid, Group, SimpleGrid, Tabs, Title } from '@mantine/core';
import { getDisplayString, getReferenceString, resolveId } from '@medplum/core';
import { Patient, Task } from '@medplum/fhirtypes';
import { DefaultResourceTimeline, Document, Loading, ResourceTable, useMedplum } from '@medplum/react';
import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { useNavigate } from 'react-router-dom';
import { PatientChart } from '../components/PatientChart';
import { TaskActions } from '../components/TaskActions';
import { NotesPage } from './NotesPage';

export function TaskPage(): JSX.Element {
  const medplum = useMedplum();
  const navigate = useNavigate();
  const { id } = useParams() as { id: string };
  const [task, setTask] = useState<Task | undefined>(undefined);
  const tabs = ['Details', 'Timeline', 'Notes'];
  const [patient, setPatient] = useState<Patient | undefined>();

  // Set the current tab to what is in the URL, otherwise default to 'Details'
  const [currentTab, setCurrentTab] = useState<string>(() => {
    const tab = window.location.pathname.split('/').pop();
    return tab && tabs.map((t) => t.toLowerCase()).includes(tab) ? tab : tabs[0].toLowerCase();
  });

  useEffect(() => {
    // Fetch the task that is specified in the URL
    const fetchTask = async () => {
      try {
        const taskData = await medplum.readResource('Task', id);
        setTask(taskData);
      } catch (error) {
        console.error(error);
      }
    };

    // Fetch the patient that this task if for. See https://www.medplum.com/docs/careplans/tasks#task-assignment for more details
    const fetchLinkedPatient = async () => {
      if (task && task.for) {
        const patientId = resolveId(task.for);
        try {
          const patientData = patientId ? await medplum.readResource('Patient', patientId) : undefined;
          setPatient(patientData);
        } catch (error) {
          console.error(error);
        }
      }
    };

    // if (id) {
    //   medplum.readResource('Task', id).then(setTask).catch(console.error);
    // }

    fetchTask();
    fetchLinkedPatient();
  }, [medplum, id, task]);

  // Update the current tab and navigate to its URL
  const handleTabChange = (newTab: string) => {
    setCurrentTab(newTab);
    navigate(`/Task/${id}/${newTab}`);
  };

  const handleTaskChange = (updatedTask: Task) => {
    setTask(updatedTask);
  };

  if (!task) {
    return <Loading />;
  }

  return (
    <Grid>
      <Grid.Col span={6}>
        <div>{patient ? <PatientChart patient={patient} /> : <div>No patient linked to this task</div>}</div>
      </Grid.Col>
      <Grid.Col span={6}>
        <Document key={getReferenceString(task)}>
          <Title>{getDisplayString(task)}</Title>
          <Tabs value={currentTab.toLowerCase()} onTabChange={handleTabChange}>
            <Tabs.List style={{ whiteSpace: 'nowrap', flexWrap: 'nowrap' }}>
              {tabs.map((tab) => (
                <Tabs.Tab key={tab} value={tab.toLowerCase()}>
                  {tab}
                </Tabs.Tab>
              ))}
            </Tabs.List>
            <Tabs.Panel value="details">
              <ResourceTable key={`Task/${id}`} value={task} ignoreMissingValues={false} />
            </Tabs.Panel>
            <Tabs.Panel value="timeline">
              <DefaultResourceTimeline resource={task} />
            </Tabs.Panel>
            <Tabs.Panel value="notes">
              <NotesPage task={task} />
            </Tabs.Panel>
          </Tabs>
        </Document>
      </Grid.Col>
      <Grid.Col span={3}>
        <Document>
          <TaskActions task={task} onChange={handleTaskChange} />
        </Document>
      </Grid.Col>
    </Grid>
  );
}
