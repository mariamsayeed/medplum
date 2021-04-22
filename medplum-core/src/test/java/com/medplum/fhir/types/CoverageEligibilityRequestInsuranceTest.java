/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class CoverageEligibilityRequestInsuranceTest {

    @Test
    public void testId() {
        assertEquals("x", CoverageEligibilityRequest.CoverageEligibilityRequestInsurance.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CoverageEligibilityRequest.CoverageEligibilityRequestInsurance.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testFocal() {
        assertEquals(true, CoverageEligibilityRequest.CoverageEligibilityRequestInsurance.create().focal(true).build().focal());
    }

    @Test
    public void testCoverage() {
        final Reference value = Reference.create().build();
        assertEquals(value, CoverageEligibilityRequest.CoverageEligibilityRequestInsurance.create().coverage(value).build().coverage());
    }

    @Test
    public void testBusinessArrangement() {
        assertEquals("x", CoverageEligibilityRequest.CoverageEligibilityRequestInsurance.create().businessArrangement("x").build().businessArrangement());
    }
}
