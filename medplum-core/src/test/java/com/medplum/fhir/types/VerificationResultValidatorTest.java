/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class VerificationResultValidatorTest {

    @Test
    public void testId() {
        assertEquals("x", VerificationResult.VerificationResultValidator.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, VerificationResult.VerificationResultValidator.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testOrganization() {
        final Reference value = Reference.create().build();
        assertEquals(value, VerificationResult.VerificationResultValidator.create().organization(value).build().organization());
    }

    @Test
    public void testIdentityCertificate() {
        assertEquals("x", VerificationResult.VerificationResultValidator.create().identityCertificate("x").build().identityCertificate());
    }

    @Test
    public void testAttestationSignature() {
        final Signature value = Signature.create().build();
        assertEquals(value, VerificationResult.VerificationResultValidator.create().attestationSignature(value).build().attestationSignature());
    }
}
