/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ValueSetConceptTest {

    @Test
    public void testId() {
        assertEquals("x", ValueSet.ValueSetConcept.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ValueSet.ValueSetConcept.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        assertEquals("x", ValueSet.ValueSetConcept.create().code("x").build().code());
    }

    @Test
    public void testDisplay() {
        assertEquals("x", ValueSet.ValueSetConcept.create().display("x").build().display());
    }

    @Test
    public void testDesignation() {
        final java.util.List<ValueSet.ValueSetDesignation> value = java.util.Collections.emptyList();
        assertEquals(value, ValueSet.ValueSetConcept.create().designation(value).build().designation());
    }
}
