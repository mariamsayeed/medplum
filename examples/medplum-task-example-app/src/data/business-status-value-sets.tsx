import { ValueSet } from '@medplum/fhirtypes';

export const businessStatus: ValueSet = {
  resourceType: 'ValueSet',
  id: 'business-status',
  url: 'https://example-business.org',
  name: 'example-business-status-value-set',
  title: 'Example Business Status Value Set',
  status: 'active',
  compose: {
    include: [
      {
        system: 'https://example-business.org/custom-business-codes',
        concept: [
          {
            code: 'doctor-sign-off-needed',
            display: 'Doctor sign-off needed.',
          },
          {
            code: 'doctor-review-needed',
            display: 'Doctor review needed.',
          },
          {
            code: 'follow-up-needed',
            display: 'Follow-up needed.',
          },
        ],
      },
    ],
  },
};
