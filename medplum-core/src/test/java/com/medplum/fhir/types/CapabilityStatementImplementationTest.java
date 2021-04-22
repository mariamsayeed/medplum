/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class CapabilityStatementImplementationTest {

    @Test
    public void testId() {
        assertEquals("x", CapabilityStatement.CapabilityStatementImplementation.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementImplementation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testDescription() {
        assertEquals("x", CapabilityStatement.CapabilityStatementImplementation.create().description("x").build().description());
    }

    @Test
    public void testUrl() {
        assertEquals("x", CapabilityStatement.CapabilityStatementImplementation.create().url("x").build().url());
    }

    @Test
    public void testCustodian() {
        final Reference value = Reference.create().build();
        assertEquals(value, CapabilityStatement.CapabilityStatementImplementation.create().custodian(value).build().custodian());
    }
}
