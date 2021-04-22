/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class CapabilityStatementSecurityTest {

    @Test
    public void testId() {
        assertEquals("x", CapabilityStatement.CapabilityStatementSecurity.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementSecurity.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCors() {
        assertEquals(true, CapabilityStatement.CapabilityStatementSecurity.create().cors(true).build().cors());
    }

    @Test
    public void testService() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementSecurity.create().service(value).build().service());
    }

    @Test
    public void testDescription() {
        assertEquals("x", CapabilityStatement.CapabilityStatementSecurity.create().description("x").build().description());
    }
}
