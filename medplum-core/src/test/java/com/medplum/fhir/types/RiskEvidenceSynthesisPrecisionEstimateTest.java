/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class RiskEvidenceSynthesisPrecisionEstimateTest {

    @Test
    public void testId() {
        assertEquals("x", RiskEvidenceSynthesis.RiskEvidenceSynthesisPrecisionEstimate.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, RiskEvidenceSynthesis.RiskEvidenceSynthesisPrecisionEstimate.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, RiskEvidenceSynthesis.RiskEvidenceSynthesisPrecisionEstimate.create().type(value).build().type());
    }

    @Test
    public void testLevel() {
        assertEquals(1.0, RiskEvidenceSynthesis.RiskEvidenceSynthesisPrecisionEstimate.create().level(1.0).build().level());
    }

    @Test
    public void testFrom() {
        assertEquals(1.0, RiskEvidenceSynthesis.RiskEvidenceSynthesisPrecisionEstimate.create().from(1.0).build().from());
    }

    @Test
    public void testTo() {
        assertEquals(1.0, RiskEvidenceSynthesis.RiskEvidenceSynthesisPrecisionEstimate.create().to(1.0).build().to());
    }
}
