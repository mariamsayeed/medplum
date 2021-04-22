/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class PlanDefinitionTargetTest {

    @Test
    public void testId() {
        assertEquals("x", PlanDefinition.PlanDefinitionTarget.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionTarget.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testMeasure() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionTarget.create().measure(value).build().measure());
    }

    @Test
    public void testDetailQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionTarget.create().detailQuantity(value).build().detailQuantity());
    }

    @Test
    public void testDetailRange() {
        final Range value = Range.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionTarget.create().detailRange(value).build().detailRange());
    }

    @Test
    public void testDetailCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionTarget.create().detailCodeableConcept(value).build().detailCodeableConcept());
    }

    @Test
    public void testDue() {
        final Duration value = Duration.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionTarget.create().due(value).build().due());
    }
}
