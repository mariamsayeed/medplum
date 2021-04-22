/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class OperationDefinitionParameterTest {

    @Test
    public void testId() {
        assertEquals("x", OperationDefinition.OperationDefinitionParameter.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, OperationDefinition.OperationDefinitionParameter.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testName() {
        assertEquals("x", OperationDefinition.OperationDefinitionParameter.create().name("x").build().name());
    }

    @Test
    public void testUse() {
        assertEquals("x", OperationDefinition.OperationDefinitionParameter.create().use("x").build().use());
    }

    @Test
    public void testMin() {
        assertEquals(1, OperationDefinition.OperationDefinitionParameter.create().min(1).build().min());
    }

    @Test
    public void testMax() {
        assertEquals("x", OperationDefinition.OperationDefinitionParameter.create().max("x").build().max());
    }

    @Test
    public void testDocumentation() {
        assertEquals("x", OperationDefinition.OperationDefinitionParameter.create().documentation("x").build().documentation());
    }

    @Test
    public void testType() {
        assertEquals("x", OperationDefinition.OperationDefinitionParameter.create().type("x").build().type());
    }

    @Test
    public void testTargetProfile() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, OperationDefinition.OperationDefinitionParameter.create().targetProfile(value).build().targetProfile());
    }

    @Test
    public void testSearchType() {
        assertEquals("x", OperationDefinition.OperationDefinitionParameter.create().searchType("x").build().searchType());
    }

    @Test
    public void testBinding() {
        final OperationDefinition.OperationDefinitionBinding value = OperationDefinition.OperationDefinitionBinding.create().build();
        assertEquals(value, OperationDefinition.OperationDefinitionParameter.create().binding(value).build().binding());
    }

    @Test
    public void testReferencedFrom() {
        final java.util.List<OperationDefinition.OperationDefinitionReferencedFrom> value = java.util.Collections.emptyList();
        assertEquals(value, OperationDefinition.OperationDefinitionParameter.create().referencedFrom(value).build().referencedFrom());
    }

    @Test
    public void testPart() {
        final java.util.List<OperationDefinition.OperationDefinitionParameter> value = java.util.Collections.emptyList();
        assertEquals(value, OperationDefinition.OperationDefinitionParameter.create().part(value).build().part());
    }
}
