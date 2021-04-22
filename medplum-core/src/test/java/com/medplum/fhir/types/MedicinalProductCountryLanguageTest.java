/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class MedicinalProductCountryLanguageTest {

    @Test
    public void testId() {
        assertEquals("x", MedicinalProduct.MedicinalProductCountryLanguage.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProduct.MedicinalProductCountryLanguage.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCountry() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProduct.MedicinalProductCountryLanguage.create().country(value).build().country());
    }

    @Test
    public void testJurisdiction() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProduct.MedicinalProductCountryLanguage.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testLanguage() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProduct.MedicinalProductCountryLanguage.create().language(value).build().language());
    }
}
