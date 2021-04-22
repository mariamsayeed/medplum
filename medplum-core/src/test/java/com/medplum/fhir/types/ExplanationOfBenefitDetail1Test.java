/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ExplanationOfBenefitDetail1Test {

    @Test
    public void testId() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testProductOrService() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().productOrService(value).build().productOrService());
    }

    @Test
    public void testModifier() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().modifier(value).build().modifier());
    }

    @Test
    public void testQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().quantity(value).build().quantity());
    }

    @Test
    public void testUnitPrice() {
        final Money value = Money.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().unitPrice(value).build().unitPrice());
    }

    @Test
    public void testFactor() {
        assertEquals(1.0, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().factor(1.0).build().factor());
    }

    @Test
    public void testNet() {
        final Money value = Money.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().net(value).build().net());
    }

    @Test
    public void testNoteNumber() {
        final java.util.List<Integer> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().noteNumber(value).build().noteNumber());
    }

    @Test
    public void testAdjudication() {
        final java.util.List<ExplanationOfBenefit.ExplanationOfBenefitAdjudication> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().adjudication(value).build().adjudication());
    }

    @Test
    public void testSubDetail() {
        final java.util.List<ExplanationOfBenefit.ExplanationOfBenefitSubDetail1> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitDetail1.create().subDetail(value).build().subDetail());
    }
}
