import { Button } from '@mantine/core';
import { notifications } from '@mantine/notifications';
import { MedplumClient, PatchOperation } from '@medplum/core';
import { Task } from '@medplum/fhirtypes';
import { IconCircleCheck, IconCircleOff } from '@tabler/icons-react';

interface CompleteTaskProps {
  task: Task;
  onChange: (updatedTask: Task) => void;
  medplum: MedplumClient;
}

export function CompleteTask({ task, onChange, medplum }: CompleteTaskProps): JSX.Element {
  const handleCompleteTask = async (): Promise<void> => {
    if (!task?.id) {
      return;
    }

    const ops: PatchOperation[] = [
      { op: 'test', path: '/meta/versionId', value: task.meta?.versionId },
      { op: 'replace', path: '/status', value: 'completed' },
    ];

    try {
      const result = await medplum.patchResource('Task', task.id, ops);
      notifications.show({
        icon: <IconCircleCheck />,
        title: 'Success',
        message: ops[1].value === 'on-hold' ? 'Task paused' : 'Task resumed',
      });
      onChange(result);
    } catch (error) {
      notifications.show({
        color: 'red',
        icon: <IconCircleOff />,
        title: 'Error',
        message: 'Another user modified this task.',
      });
    }
  };

  return (
    <div>
      {task.status === 'completed' ? null : (
        <Button fullWidth onClick={handleCompleteTask}>
          Complete Task
        </Button>
      )}
    </div>
  );
}
