/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class RiskAssessmentTest {

    @Test
    public void testResourceType() {
        assertEquals("x", RiskAssessment.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", RiskAssessment.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, RiskAssessment.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", RiskAssessment.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", RiskAssessment.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, RiskAssessment.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, RiskAssessment.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, RiskAssessment.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, RiskAssessment.create().identifier(value).build().identifier());
    }

    @Test
    public void testBasedOn() {
        final Reference value = Reference.create().build();
        assertEquals(value, RiskAssessment.create().basedOn(value).build().basedOn());
    }

    @Test
    public void testParent() {
        final Reference value = Reference.create().build();
        assertEquals(value, RiskAssessment.create().parent(value).build().parent());
    }

    @Test
    public void testStatus() {
        assertEquals("x", RiskAssessment.create().status("x").build().status());
    }

    @Test
    public void testMethod() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, RiskAssessment.create().method(value).build().method());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, RiskAssessment.create().code(value).build().code());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, RiskAssessment.create().subject(value).build().subject());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, RiskAssessment.create().encounter(value).build().encounter());
    }

    @Test
    public void testOccurrenceDateTime() {
        assertEquals("x", RiskAssessment.create().occurrenceDateTime("x").build().occurrenceDateTime());
    }

    @Test
    public void testOccurrencePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, RiskAssessment.create().occurrencePeriod(value).build().occurrencePeriod());
    }

    @Test
    public void testCondition() {
        final Reference value = Reference.create().build();
        assertEquals(value, RiskAssessment.create().condition(value).build().condition());
    }

    @Test
    public void testPerformer() {
        final Reference value = Reference.create().build();
        assertEquals(value, RiskAssessment.create().performer(value).build().performer());
    }

    @Test
    public void testReasonCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, RiskAssessment.create().reasonCode(value).build().reasonCode());
    }

    @Test
    public void testReasonReference() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, RiskAssessment.create().reasonReference(value).build().reasonReference());
    }

    @Test
    public void testBasis() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, RiskAssessment.create().basis(value).build().basis());
    }

    @Test
    public void testPrediction() {
        final java.util.List<RiskAssessment.RiskAssessmentPrediction> value = java.util.Collections.emptyList();
        assertEquals(value, RiskAssessment.create().prediction(value).build().prediction());
    }

    @Test
    public void testMitigation() {
        assertEquals("x", RiskAssessment.create().mitigation("x").build().mitigation());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, RiskAssessment.create().note(value).build().note());
    }
}
