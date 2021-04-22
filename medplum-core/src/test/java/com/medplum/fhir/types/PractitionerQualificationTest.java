/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class PractitionerQualificationTest {

    @Test
    public void testId() {
        assertEquals("x", Practitioner.PractitionerQualification.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Practitioner.PractitionerQualification.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Practitioner.PractitionerQualification.create().identifier(value).build().identifier());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Practitioner.PractitionerQualification.create().code(value).build().code());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Practitioner.PractitionerQualification.create().period(value).build().period());
    }

    @Test
    public void testIssuer() {
        final Reference value = Reference.create().build();
        assertEquals(value, Practitioner.PractitionerQualification.create().issuer(value).build().issuer());
    }
}
