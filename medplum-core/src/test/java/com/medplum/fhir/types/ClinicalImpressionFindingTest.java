/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ClinicalImpressionFindingTest {

    @Test
    public void testId() {
        assertEquals("x", ClinicalImpression.ClinicalImpressionFinding.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.ClinicalImpressionFinding.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testItemCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ClinicalImpression.ClinicalImpressionFinding.create().itemCodeableConcept(value).build().itemCodeableConcept());
    }

    @Test
    public void testItemReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, ClinicalImpression.ClinicalImpressionFinding.create().itemReference(value).build().itemReference());
    }

    @Test
    public void testBasis() {
        assertEquals("x", ClinicalImpression.ClinicalImpressionFinding.create().basis("x").build().basis());
    }
}
