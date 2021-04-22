/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ImmunizationRecommendationRecommendationTest {

    @Test
    public void testId() {
        assertEquals("x", ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testVaccineCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().vaccineCode(value).build().vaccineCode());
    }

    @Test
    public void testTargetDisease() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().targetDisease(value).build().targetDisease());
    }

    @Test
    public void testContraindicatedVaccineCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().contraindicatedVaccineCode(value).build().contraindicatedVaccineCode());
    }

    @Test
    public void testForecastStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().forecastStatus(value).build().forecastStatus());
    }

    @Test
    public void testForecastReason() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().forecastReason(value).build().forecastReason());
    }

    @Test
    public void testDateCriterion() {
        final java.util.List<ImmunizationRecommendation.ImmunizationRecommendationDateCriterion> value = java.util.Collections.emptyList();
        assertEquals(value, ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().dateCriterion(value).build().dateCriterion());
    }

    @Test
    public void testDescription() {
        assertEquals("x", ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().description("x").build().description());
    }

    @Test
    public void testSeries() {
        assertEquals("x", ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().series("x").build().series());
    }

    @Test
    public void testDoseNumberPositiveInt() {
        assertEquals(1, ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().doseNumberPositiveInt(1).build().doseNumberPositiveInt());
    }

    @Test
    public void testDoseNumberString() {
        assertEquals("x", ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().doseNumberString("x").build().doseNumberString());
    }

    @Test
    public void testSeriesDosesPositiveInt() {
        assertEquals(1, ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().seriesDosesPositiveInt(1).build().seriesDosesPositiveInt());
    }

    @Test
    public void testSeriesDosesString() {
        assertEquals("x", ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().seriesDosesString("x").build().seriesDosesString());
    }

    @Test
    public void testSupportingImmunization() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().supportingImmunization(value).build().supportingImmunization());
    }

    @Test
    public void testSupportingPatientInformation() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ImmunizationRecommendation.ImmunizationRecommendationRecommendation.create().supportingPatientInformation(value).build().supportingPatientInformation());
    }
}
