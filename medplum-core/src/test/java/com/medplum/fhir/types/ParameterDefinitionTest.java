/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ParameterDefinitionTest {

    @Test
    public void testId() {
        assertEquals("x", ParameterDefinition.create().id("x").build().id());
    }

    @Test
    public void testName() {
        assertEquals("x", ParameterDefinition.create().name("x").build().name());
    }

    @Test
    public void testUse() {
        assertEquals("x", ParameterDefinition.create().use("x").build().use());
    }

    @Test
    public void testMin() {
        assertEquals(1, ParameterDefinition.create().min(1).build().min());
    }

    @Test
    public void testMax() {
        assertEquals("x", ParameterDefinition.create().max("x").build().max());
    }

    @Test
    public void testDocumentation() {
        assertEquals("x", ParameterDefinition.create().documentation("x").build().documentation());
    }

    @Test
    public void testType() {
        assertEquals("x", ParameterDefinition.create().type("x").build().type());
    }

    @Test
    public void testProfile() {
        assertEquals("x", ParameterDefinition.create().profile("x").build().profile());
    }
}
