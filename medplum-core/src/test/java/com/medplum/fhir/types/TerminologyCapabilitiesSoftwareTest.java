/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TerminologyCapabilitiesSoftwareTest {

    @Test
    public void testId() {
        assertEquals("x", TerminologyCapabilities.TerminologyCapabilitiesSoftware.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TerminologyCapabilities.TerminologyCapabilitiesSoftware.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testName() {
        assertEquals("x", TerminologyCapabilities.TerminologyCapabilitiesSoftware.create().name("x").build().name());
    }

    @Test
    public void testVersion() {
        assertEquals("x", TerminologyCapabilities.TerminologyCapabilitiesSoftware.create().version("x").build().version());
    }
}
