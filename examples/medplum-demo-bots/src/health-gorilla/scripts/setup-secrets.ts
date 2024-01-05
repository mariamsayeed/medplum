import { MedplumClient, PatchOperation } from '@medplum/core';
import dotenv from 'dotenv';
dotenv.config();

const HEALTH_GORILLA_INTEGRATION_SECRETS: readonly string[] = [];

async function updateProjectSecrets(medplum: MedplumClient): Promise<void> {
  const project = await medplum.searchOne('Project');
  if (!project?.id || !project?.secret) {
    throw new Error('Project secrets not found: ' + JSON.stringify(medplum.getAccessToken()));
  }

  const toBeUpdated = new Set(HEALTH_GORILLA_INTEGRATION_SECRETS);

  const secrets = project.secret;
  const ops: PatchOperation[] = [];
  secrets.forEach((secret, index) => {
    const secretName = secret.name as string;
    if (toBeUpdated.has(secretName)) {
      const secretVal = process.env[secretName];
      if (!secretVal) {
        throw new Error(`No value for secret '${secretName}'`);
      }
      ops.push({
        op: 'replace',
        path: `/secret/${index}`,
        value: {
          ...secret,
          valueString: secretVal,
        },
      });
      toBeUpdated.delete(secretName);
    }
  });

  toBeUpdated.forEach((secretName) => {
    const secretVal = process.env[secretName];
    if (!secretVal) {
      throw new Error(`No value for secret '${secretName}'`);
    }
    ops.push({
      op: 'add',
      path: `/secret/-`,
      value: {
        name: secretName,
        valueString: secretVal,
      },
    });
  });

  console.log('Updating Secrets:');
  console.log(JSON.stringify(ops, null, 2));
  await medplum.patchResource('Project', project.id, ops);
  console.log('Done');
}

async function main(): Promise<void> {
  if (!process.env['MEDPLUM_CLIENT_ID']) {
    throw new Error('Missing MEDPLUM_CLIENT_ID');
  }
  if (!process.env['MEDPLUM_CLIENT_SECRET']) {
    throw new Error('Missing MEDPLUM_CLIENT_SECRET');
  }

  const medplum = new MedplumClient({
    clientId: process.env['MEDPLUM_CLIENT_ID'],
    clientSecret: process.env['MEDPLUM_CLIENT_SECRET'],
  });

  await updateProjectSecrets(medplum);
}

main()
  .then(() => console.log('Health Gorilla Secrets Updated Successfully'))
  .catch(console.error);
