/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class NutritionOrderSupplementTest {

    @Test
    public void testId() {
        assertEquals("x", NutritionOrder.NutritionOrderSupplement.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, NutritionOrder.NutritionOrderSupplement.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, NutritionOrder.NutritionOrderSupplement.create().type(value).build().type());
    }

    @Test
    public void testProductName() {
        assertEquals("x", NutritionOrder.NutritionOrderSupplement.create().productName("x").build().productName());
    }

    @Test
    public void testSchedule() {
        final java.util.List<Timing> value = java.util.Collections.emptyList();
        assertEquals(value, NutritionOrder.NutritionOrderSupplement.create().schedule(value).build().schedule());
    }

    @Test
    public void testQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, NutritionOrder.NutritionOrderSupplement.create().quantity(value).build().quantity());
    }

    @Test
    public void testInstruction() {
        assertEquals("x", NutritionOrder.NutritionOrderSupplement.create().instruction("x").build().instruction());
    }
}
