import { Group, Stack, createStyles } from '@mantine/core';
import { InternalSchemaElement, getPropertyDisplayName, isEmpty, isPopulated } from '@medplum/core';
import { OperationOutcome } from '@medplum/fhirtypes';
import { useMemo, useState } from 'react';
import { ElementsInput } from '../ElementsInput/ElementsInput';
import { FormSection } from '../FormSection/FormSection';
import { ElementDefinitionTypeInput } from '../ResourcePropertyInput/ResourcePropertyInput';
import { killEvent } from '../utils/dom';
import { SupportedSliceDefinition } from './SliceInput.utils';
import { ArrayAddButton } from '../buttons/ArrayAddButton';
import { ArrayRemoveButton } from '../buttons/ArrayRemoveButton';
import { ElementsContext, ElementsContextType, buildElementsContext } from '../ElementsInput/ElementsInput.utils';

export type SliceInputProps = Readonly<{
  slice: SupportedSliceDefinition;
  property: InternalSchemaElement;
  defaultValue: any[];
  onChange: (newValue: any[]) => void;
  outcome?: OperationOutcome;
  testId?: string;
}>;

const useStyles = createStyles((theme) => ({
  indented: {
    marginTop: '0.5rem',
    borderLeft: `3px solid ${theme.colors.gray[4]}`,
    padding: '0.5rem 0 0.5rem 0.5rem',
  },
}));

function maybeWrapWithContext(contextValue: ElementsContextType | undefined, contents: JSX.Element): JSX.Element {
  if (contextValue) {
    return <ElementsContext.Provider value={contextValue}>{contents}</ElementsContext.Provider>;
  }

  return contents;
}

export function SliceInput(props: SliceInputProps): JSX.Element | null {
  const { slice, property } = props;
  const [values, setValues] = useState<any[]>(() => {
    return props.defaultValue.map((v) => v ?? {});
  });
  const { classes } = useStyles();

  const sliceType = slice.typeSchema?.type ?? slice.type[0].code;

  const context = useMemo(() => {
    if (!isPopulated(slice.elements)) {
      return undefined;
    }
    return buildElementsContext(slice.elements, sliceType, undefined);
  }, [slice.elements, sliceType]);

  function setValuesWrapper(newValues: any[]): void {
    setValues(newValues);
    if (props.onChange) {
      props.onChange(newValues);
    }
  }

  const required = slice.min > 0;

  // this is a bit of a hack targeted at nested extensions; indentation would ideally be controlled elsewhere
  // e.g. USCorePatientProfile -> USCoreEthnicityExtension -> {ombCategory, detailed, text}
  const indentedStack = isEmpty(slice.elements);
  const propertyDisplayName = getPropertyDisplayName(slice.name);
  return maybeWrapWithContext(
    context,
    <FormSection
      title={propertyDisplayName}
      description={slice.definition}
      withAsterisk={required}
      fhirPath={`${property.path}:${slice.name}`}
      testId={props.testId}
    >
      <Stack className={indentedStack ? classes.indented : undefined}>
        {values.map((value, valueIndex) => {
          let contents: JSX.Element;
          if (false && isPopulated(slice.elements)) {
            contents = (
              <ElementsInput
                type={slice.typeSchema?.type ?? slice.type[0].code}
                elements={slice.elements}
                defaultValue={value}
                outcome={props.outcome}
                onChange={(newValue) => {
                  const newValues = [...values];
                  newValues[valueIndex] = newValue;
                  setValuesWrapper(newValues);
                }}
                testId={props.testId && `${props.testId}-elements-${valueIndex}`}
                typeSchema={slice.typeSchema}
              />
            );
          } else {
            contents = (
              <ElementDefinitionTypeInput
                elementDefinitionType={slice.type[0]}
                name={slice.name}
                defaultValue={value}
                onChange={(newValue) => {
                  const newValues = [...values];
                  newValues[valueIndex] = newValue;
                  setValuesWrapper(newValues);
                }}
                outcome={undefined}
                min={slice.min}
                max={slice.max}
                binding={undefined}
                path={slice.path}
              />
            );
          }

          return (
            <Group key={`${valueIndex}-${values.length}`} noWrap>
              <div style={{ flexGrow: 1 }}>
                <Stack>{contents}</Stack>
              </div>
              {values.length > slice.min && (
                <ArrayRemoveButton
                  propertyDisplayName={propertyDisplayName}
                  testId={props.testId && `${props.testId}-remove-${valueIndex}`}
                  onClick={(e: React.MouseEvent) => {
                    killEvent(e);
                    const newValues = [...values];
                    newValues.splice(valueIndex, 1);
                    setValuesWrapper(newValues);
                  }}
                />
              )}
            </Group>
          );
        })}
        {values.length < slice.max && (
          <Group noWrap style={{ justifyContent: 'flex-start' }}>
            <ArrayAddButton
              propertyDisplayName={propertyDisplayName}
              onClick={(e: React.MouseEvent) => {
                killEvent(e);
                const newValues = [...values, undefined];
                setValuesWrapper(newValues);
              }}
              testId={props.testId && `${props.testId}-add`}
            />
          </Group>
        )}
      </Stack>
    </FormSection>
  );
}
