/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class VisionPrescriptionPrismTest {

    @Test
    public void testId() {
        assertEquals("x", VisionPrescription.VisionPrescriptionPrism.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, VisionPrescription.VisionPrescriptionPrism.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testAmount() {
        assertEquals(1.0, VisionPrescription.VisionPrescriptionPrism.create().amount(1.0).build().amount());
    }

    @Test
    public void testBase() {
        assertEquals("x", VisionPrescription.VisionPrescriptionPrism.create().base("x").build().base());
    }
}
