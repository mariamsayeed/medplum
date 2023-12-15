import { Paper, Text } from '@mantine/core';
import { notifications } from '@mantine/notifications';
import { Resource } from '@medplum/fhirtypes';
import { Document, ResourceForm, useMedplum } from '@medplum/react';
import { useLocation, useNavigate } from 'react-router-dom';

export function CreateResourcePage(): JSX.Element {
  const navigate = useNavigate();
  const medplum = useMedplum();
  const location = useLocation();
  const resourceType = location.pathname.split('/')[1];

  // Create a default resource with the correct resourceType
  const defaultResource = { resourceType } as Resource;

  // Function to create the resource and navigate to the resource page when the form is submitted
  const handleSubmit = (newResource: Resource): void => {
    medplum
      .createResource(newResource)
      .then((result) => {
        navigate(`/${resourceType}/${result.id}`);
        notifications.show({
          title: 'Success',
          message: `${result.resourceType} created!`,
        });
      })
      .catch((error) =>
        notifications.show({
          title: 'Error',
          message: `Resource could not be created: ${error}`,
        })
      );
  };

  return (
    <Document>
      <Paper>
        <Text>New {resourceType}</Text>
        <ResourceForm defaultValue={defaultResource} onSubmit={handleSubmit}></ResourceForm>
      </Paper>
    </Document>
  );
}
