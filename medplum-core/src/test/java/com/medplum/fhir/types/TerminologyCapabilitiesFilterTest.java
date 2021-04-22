/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TerminologyCapabilitiesFilterTest {

    @Test
    public void testId() {
        assertEquals("x", TerminologyCapabilities.TerminologyCapabilitiesFilter.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TerminologyCapabilities.TerminologyCapabilitiesFilter.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        assertEquals("x", TerminologyCapabilities.TerminologyCapabilitiesFilter.create().code("x").build().code());
    }

    @Test
    public void testOp() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, TerminologyCapabilities.TerminologyCapabilitiesFilter.create().op(value).build().op());
    }
}
