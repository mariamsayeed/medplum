import { Modal, Text } from '@mantine/core';
import { Resource } from '@medplum/fhirtypes';
import { ResourceForm, useMedplum } from '@medplum/react';
import { useLocation } from 'react-router-dom';
import { useNavigate } from 'react-router-dom';

interface CreateTaskModalProps {
  opened: boolean;
  onClose: () => void;
}

export function CreateTaskModal(props: CreateTaskModalProps): JSX.Element {
  const navigate = useNavigate();
  const medplum = useMedplum();
  const location = useLocation();
  const resourceType = location.pathname.split('/')[1];

  // Create a default resource with the correct resourceType
  const defaultResource = { resourceType } as Resource;

  // Function to create the resource and navigate to the resource page when the form is submitted
  const handleSubmit = (newResource: Resource) => {
    medplum
      .createResource(newResource)
      .then((result) => navigate(`/${resourceType}/${result.id}`))
      .catch((error) => console.error(error));
  };

  return (
    <Modal opened={props.opened} onClose={props.onClose}>
      <Text>New {resourceType}</Text>
      <ResourceForm defaultValue={defaultResource} onSubmit={handleSubmit}></ResourceForm>
    </Modal>
  );
}