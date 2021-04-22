/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class PlanDefinitionConditionTest {

    @Test
    public void testId() {
        assertEquals("x", PlanDefinition.PlanDefinitionCondition.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionCondition.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testKind() {
        assertEquals("x", PlanDefinition.PlanDefinitionCondition.create().kind("x").build().kind());
    }

    @Test
    public void testExpression() {
        final Expression value = Expression.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionCondition.create().expression(value).build().expression());
    }
}
