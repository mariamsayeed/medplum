/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class CompositionEventTest {

    @Test
    public void testId() {
        assertEquals("x", Composition.CompositionEvent.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.CompositionEvent.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.CompositionEvent.create().code(value).build().code());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Composition.CompositionEvent.create().period(value).build().period());
    }

    @Test
    public void testDetail() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Composition.CompositionEvent.create().detail(value).build().detail());
    }
}
