/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ClaimPayeeTest {

    @Test
    public void testId() {
        assertEquals("x", Claim.ClaimPayee.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimPayee.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Claim.ClaimPayee.create().type(value).build().type());
    }

    @Test
    public void testParty() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.ClaimPayee.create().party(value).build().party());
    }
}
