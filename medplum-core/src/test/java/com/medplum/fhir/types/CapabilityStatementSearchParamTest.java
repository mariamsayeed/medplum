/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class CapabilityStatementSearchParamTest {

    @Test
    public void testId() {
        assertEquals("x", CapabilityStatement.CapabilityStatementSearchParam.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementSearchParam.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testName() {
        assertEquals("x", CapabilityStatement.CapabilityStatementSearchParam.create().name("x").build().name());
    }

    @Test
    public void testDefinition() {
        assertEquals("x", CapabilityStatement.CapabilityStatementSearchParam.create().definition("x").build().definition());
    }

    @Test
    public void testType() {
        assertEquals("x", CapabilityStatement.CapabilityStatementSearchParam.create().type("x").build().type());
    }

    @Test
    public void testDocumentation() {
        assertEquals("x", CapabilityStatement.CapabilityStatementSearchParam.create().documentation("x").build().documentation());
    }
}
