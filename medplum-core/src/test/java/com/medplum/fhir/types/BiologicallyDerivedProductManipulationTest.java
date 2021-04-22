/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class BiologicallyDerivedProductManipulationTest {

    @Test
    public void testId() {
        assertEquals("x", BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testDescription() {
        assertEquals("x", BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation.create().description("x").build().description());
    }

    @Test
    public void testTimeDateTime() {
        assertEquals("x", BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation.create().timeDateTime("x").build().timeDateTime());
    }

    @Test
    public void testTimePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, BiologicallyDerivedProduct.BiologicallyDerivedProductManipulation.create().timePeriod(value).build().timePeriod());
    }
}
