/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class MedicationKnowledgeMonographTest {

    @Test
    public void testId() {
        assertEquals("x", MedicationKnowledge.MedicationKnowledgeMonograph.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeMonograph.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeMonograph.create().type(value).build().type());
    }

    @Test
    public void testSource() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationKnowledge.MedicationKnowledgeMonograph.create().source(value).build().source());
    }
}
