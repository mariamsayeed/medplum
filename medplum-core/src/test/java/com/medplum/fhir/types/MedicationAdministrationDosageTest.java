/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class MedicationAdministrationDosageTest {

    @Test
    public void testId() {
        assertEquals("x", MedicationAdministration.MedicationAdministrationDosage.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationAdministration.MedicationAdministrationDosage.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testText() {
        assertEquals("x", MedicationAdministration.MedicationAdministrationDosage.create().text("x").build().text());
    }

    @Test
    public void testSite() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationAdministration.MedicationAdministrationDosage.create().site(value).build().site());
    }

    @Test
    public void testRoute() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationAdministration.MedicationAdministrationDosage.create().route(value).build().route());
    }

    @Test
    public void testMethod() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationAdministration.MedicationAdministrationDosage.create().method(value).build().method());
    }

    @Test
    public void testDose() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, MedicationAdministration.MedicationAdministrationDosage.create().dose(value).build().dose());
    }

    @Test
    public void testRateRatio() {
        final Ratio value = Ratio.create().build();
        assertEquals(value, MedicationAdministration.MedicationAdministrationDosage.create().rateRatio(value).build().rateRatio());
    }

    @Test
    public void testRateQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, MedicationAdministration.MedicationAdministrationDosage.create().rateQuantity(value).build().rateQuantity());
    }
}
