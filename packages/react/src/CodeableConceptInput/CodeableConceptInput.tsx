import { CodeableConcept, ValueSetExpansionContains } from '@medplum/fhirtypes';
import { useContext, useEffect, useMemo, useState } from 'react';
import { ValueSetAutocomplete, ValueSetAutocompleteProps } from '../ValueSetAutocomplete/ValueSetAutocomplete';
import { ElementsContext } from '../ElementsInput/ElementsInput.utils';
import { ComplexTypeInputProps } from '../ResourcePropertyInput/ResourcePropertyInput.utils';

export type CodeableConceptInputProps = Omit<ValueSetAutocompleteProps, 'defaultValue' | 'onChange'> &
  ComplexTypeInputProps<CodeableConcept> & {
    onChange: ((value: CodeableConcept | undefined) => void) | undefined;
  };

export function CodeableConceptInput(props: CodeableConceptInputProps): JSX.Element {
  const { defaultValue, onChange, path, ...rest } = props;
  const [value, setValue] = useState<CodeableConcept | undefined>(defaultValue);
  const { getModifiedNestedElement } = useContext(ElementsContext);

  // ignoring id, extension, version, userSelected
  const [systemElement, codeElement, displayElement] = useMemo(
    () => ['system', 'code', 'display'].map((field) => getModifiedNestedElement(path + '.' + field)),
    [getModifiedNestedElement, path]
  );

  useEffect(() => {
    console.log('CC nested', { systemElement, codeElement, displayElement });
  }, [systemElement, codeElement, displayElement]);

  console.log(props);
  function handleChange(newValues: ValueSetExpansionContains[]): void {
    const newConcept = valueSetElementToCodeableConcept(newValues);
    setValue(newConcept);
    if (onChange) {
      onChange(newConcept);
    }
  }

  return (
    <ValueSetAutocomplete
      defaultValue={value && codeableConceptToValueSetElement(value)}
      onChange={handleChange}
      {...rest}
    />
  );
}

function codeableConceptToValueSetElement(concept: CodeableConcept): ValueSetExpansionContains[] | undefined {
  return concept.coding?.map((c) => ({
    system: c.system,
    code: c.code,
    display: c.display,
  }));
}

function valueSetElementToCodeableConcept(elements: ValueSetExpansionContains[]): CodeableConcept | undefined {
  if (elements.length === 0) {
    return undefined;
  }
  return {
    coding: elements.map((e) => ({
      system: e.system,
      code: e.code,
      display: e.display,
    })),
  };
}
