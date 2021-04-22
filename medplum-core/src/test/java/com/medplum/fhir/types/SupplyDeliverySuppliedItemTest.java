/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class SupplyDeliverySuppliedItemTest {

    @Test
    public void testId() {
        assertEquals("x", SupplyDelivery.SupplyDeliverySuppliedItem.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SupplyDelivery.SupplyDeliverySuppliedItem.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, SupplyDelivery.SupplyDeliverySuppliedItem.create().quantity(value).build().quantity());
    }

    @Test
    public void testItemCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SupplyDelivery.SupplyDeliverySuppliedItem.create().itemCodeableConcept(value).build().itemCodeableConcept());
    }

    @Test
    public void testItemReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, SupplyDelivery.SupplyDeliverySuppliedItem.create().itemReference(value).build().itemReference());
    }
}
