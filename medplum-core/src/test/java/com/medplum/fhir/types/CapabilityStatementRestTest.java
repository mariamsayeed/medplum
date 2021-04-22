/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class CapabilityStatementRestTest {

    @Test
    public void testId() {
        assertEquals("x", CapabilityStatement.CapabilityStatementRest.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementRest.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testMode() {
        assertEquals("x", CapabilityStatement.CapabilityStatementRest.create().mode("x").build().mode());
    }

    @Test
    public void testDocumentation() {
        assertEquals("x", CapabilityStatement.CapabilityStatementRest.create().documentation("x").build().documentation());
    }

    @Test
    public void testSecurity() {
        final CapabilityStatement.CapabilityStatementSecurity value = CapabilityStatement.CapabilityStatementSecurity.create().build();
        assertEquals(value, CapabilityStatement.CapabilityStatementRest.create().security(value).build().security());
    }

    @Test
    public void testResource() {
        final java.util.List<CapabilityStatement.CapabilityStatementResource> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementRest.create().resource(value).build().resource());
    }

    @Test
    public void testInteraction() {
        final java.util.List<CapabilityStatement.CapabilityStatementInteraction1> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementRest.create().interaction(value).build().interaction());
    }

    @Test
    public void testSearchParam() {
        final java.util.List<CapabilityStatement.CapabilityStatementSearchParam> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementRest.create().searchParam(value).build().searchParam());
    }

    @Test
    public void testOperation() {
        final java.util.List<CapabilityStatement.CapabilityStatementOperation> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementRest.create().operation(value).build().operation());
    }

    @Test
    public void testCompartment() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementRest.create().compartment(value).build().compartment());
    }
}
