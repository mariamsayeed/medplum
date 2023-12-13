import { BotEvent, getReferenceString, MedplumClient } from '@medplum/core';
import { DiagnosticReport, Task } from '@medplum/fhirtypes';

export async function handler(medplum: MedplumClient, event: BotEvent): Promise<any> {
  const report = event.input as DiagnosticReport;

  if (report.resourceType !== 'DiagnosticReport') {
    throw new Error('Unexpected input. Expected DiagnosticReport');
  }

  const task: Task = {
    resourceType: 'Task',
    code: {
      text: 'Review Diagnostic Report',
    },
    focus: {
      // The focus of the resource will be the DiagnosticReport
      reference: getReferenceString(report),
    },
    // The performer type is a medical practitioner. This will ensure it is assigned to the correct queue so a doctor can review it.
    performerType: [
      {
        coding: [
          {
            system: 'http://snomed.info/sct',
            code: '158965000',
            display: 'Medical practitioner (occupation)',
          },
        ],
      },
    ],
  };

  // Create the task and persist to the server
  await medplum.createResource(task);
}
