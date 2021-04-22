/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ChargeItemDefinitionPropertyGroupTest {

    @Test
    public void testId() {
        assertEquals("x", ChargeItemDefinition.ChargeItemDefinitionPropertyGroup.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.ChargeItemDefinitionPropertyGroup.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testApplicability() {
        final java.util.List<ChargeItemDefinition.ChargeItemDefinitionApplicability> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.ChargeItemDefinitionPropertyGroup.create().applicability(value).build().applicability());
    }

    @Test
    public void testPriceComponent() {
        final java.util.List<ChargeItemDefinition.ChargeItemDefinitionPriceComponent> value = java.util.Collections.emptyList();
        assertEquals(value, ChargeItemDefinition.ChargeItemDefinitionPropertyGroup.create().priceComponent(value).build().priceComponent());
    }
}
