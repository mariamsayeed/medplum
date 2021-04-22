/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class MedicationRequestDispenseRequestTest {

    @Test
    public void testId() {
        assertEquals("x", MedicationRequest.MedicationRequestDispenseRequest.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationRequest.MedicationRequestDispenseRequest.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testInitialFill() {
        final MedicationRequest.MedicationRequestInitialFill value = MedicationRequest.MedicationRequestInitialFill.create().build();
        assertEquals(value, MedicationRequest.MedicationRequestDispenseRequest.create().initialFill(value).build().initialFill());
    }

    @Test
    public void testDispenseInterval() {
        final Duration value = Duration.create().build();
        assertEquals(value, MedicationRequest.MedicationRequestDispenseRequest.create().dispenseInterval(value).build().dispenseInterval());
    }

    @Test
    public void testValidityPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, MedicationRequest.MedicationRequestDispenseRequest.create().validityPeriod(value).build().validityPeriod());
    }

    @Test
    public void testNumberOfRepeatsAllowed() {
        assertEquals(1, MedicationRequest.MedicationRequestDispenseRequest.create().numberOfRepeatsAllowed(1).build().numberOfRepeatsAllowed());
    }

    @Test
    public void testQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, MedicationRequest.MedicationRequestDispenseRequest.create().quantity(value).build().quantity());
    }

    @Test
    public void testExpectedSupplyDuration() {
        final Duration value = Duration.create().build();
        assertEquals(value, MedicationRequest.MedicationRequestDispenseRequest.create().expectedSupplyDuration(value).build().expectedSupplyDuration());
    }

    @Test
    public void testPerformer() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationRequest.MedicationRequestDispenseRequest.create().performer(value).build().performer());
    }
}
