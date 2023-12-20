import { Anchor, Card, Divider, Flex, Group, Paper, Stack, Text } from '@mantine/core';
import { calculateAgeString, formatHumanName, getDisplayString } from '@medplum/core';
import { HumanName, Observation, Patient } from '@medplum/fhirtypes';
import { ResourceAvatar, useMedplum, useResource } from '@medplum/react';
import { IconGenderFemale, IconStethoscope, IconUserSquare } from '@tabler/icons-react';
import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';

interface PatientChartProps {
  patient: Patient;
}

export function PatientChart(props: PatientChartProps): JSX.Element | null {
  const { id } = useParams();
  const patientId = props.patient.id;
  const medplum = useMedplum();
  const [patient, setPatient] = useState<Patient>();

  useEffect(() => {
    const query = `{
      Patient(id: "${patientId}") {
        resourceType,
        id,
        birthDate,
        gender,
        generalPractitioner { reference },
        name { given, family },
        address { line, city, state }
        photo { contentType, url, title },
        AllergyIntoleranceList(_reference: patient, _count: 100, _sort: "-_lastUpdated") {
          id,
          meta { lastUpdated },
          code { coding { code, display } },
          criticality
        }
        ConditionList(_reference: patient, _count: 100, _sort: "-_lastUpdated") {
          id,
          meta { lastUpdated },
          category { coding { code } },
          clinicalStatus { coding { display } },
          code { coding { display } },
          onsetDateTime
        }
        MedicationRequestList(_reference: subject, _count: 100, _sort: "-_lastUpdated") {
          id,
          status,
          medicationCodeableConcept { coding { code, display }},
        }
        ObservationList(_reference: subject, _count: 100, _sort: "-_lastUpdated") {
          id,
          category { coding { code } },
          code { coding { code, system, display } },
          valueCodeableConcept { coding { code, display } text },
          valueQuantity { value, unit },
          component {
            code { coding { code, system, display } },
            valueCodeableConcept { coding { code, display } text },
            valueQuantity { value, unit },
          }
          effectiveDateTime
        }
      }
    }`;

    medplum
      .graphql(query)
      .then((response) => {
        const newPatient = response.data.Patient;
        const observations = (newPatient.ObservationList ?? []) as Observation[];
        setPatient(newPatient as Patient);
      })
      .catch(console.error);
  }, [medplum, id]);

  if (!patient) {
    return null;
  }

  return (
    <Card w="95%" withBorder padding="md" radius="md" mx="md" my="xl" shadow="xs">
      <Card.Section
        h={100}
        style={{
          backgroundImage:
            'url(https://images.unsplash.com/photo-1535961652354-923cb08225a7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8bmF0dXJlJTIwc21hbGx8ZW58MHwwfDB8fHww&auto=format&fit=crop&w=800&q=60)',
        }}
      />
      <ResourceAvatar value={patient} size={80} radius={80} mx="auto" mt={-50} sx={{ border: '2px solid white' }} />
      <Text ta="center" fz="lg" fw={500}>
        {formatHumanName(patient.name?.[0] as HumanName)}
      </Text>
      <Text ta="center" fz="xs" color="dimmed">
        {patient.birthDate} ({calculateAgeString(patient.birthDate as string)})
      </Text>
      <Paper withBorder p="md" my="md">
        <Group grow>
          <Flex justify="center" align="center" direction="column" gap={0} maw="33%">
            <IconUserSquare size={24} color="gray" />
            <Text fz="xs" align="center" sx={{ whiteSpace: 'nowrap' }}>
              {formatHumanName(patient.name?.[0] as HumanName)}
            </Text>
          </Flex>
          <Flex justify="center" align="center" direction="column" gap={0}>
            <IconStethoscope size={24} color="gray" />
            <Text fz="xs" sx={{ whiteSpace: 'nowrap' }}>
              <ProviderName patient={patient} />
            </Text>
          </Flex>
          <Flex justify="center" align="center" direction="column" gap={0}>
            <IconGenderFemale size={24} color="gray" />
            <Text fz="xs" sx={{ whiteSpace: 'nowrap' }}>
              Female
            </Text>
          </Flex>
        </Group>
      </Paper>
      <Stack spacing="xs">
        <Anchor href="#">No upcoming appointments</Anchor>
        <Anchor href="#">No documented visits</Anchor>
        <Divider />
      </Stack>
    </Card>
  );
}

function ProviderName(props: { patient: Patient }): JSX.Element | null {
  const patient = props.patient;
  const provider = useResource(patient?.generalPractitioner?.[0]);
  if (provider) {
    return <>{getDisplayString(provider)}</>;
  }
  return null;
}
