/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class MeasureComponentTest {

    @Test
    public void testId() {
        assertEquals("x", Measure.MeasureComponent.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.MeasureComponent.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Measure.MeasureComponent.create().code(value).build().code());
    }

    @Test
    public void testDescription() {
        assertEquals("x", Measure.MeasureComponent.create().description("x").build().description());
    }

    @Test
    public void testCriteria() {
        final Expression value = Expression.create().build();
        assertEquals(value, Measure.MeasureComponent.create().criteria(value).build().criteria());
    }
}
