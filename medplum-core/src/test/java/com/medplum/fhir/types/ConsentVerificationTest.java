/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ConsentVerificationTest {

    @Test
    public void testId() {
        assertEquals("x", Consent.ConsentVerification.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Consent.ConsentVerification.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testVerified() {
        assertEquals(true, Consent.ConsentVerification.create().verified(true).build().verified());
    }

    @Test
    public void testVerifiedWith() {
        final Reference value = Reference.create().build();
        assertEquals(value, Consent.ConsentVerification.create().verifiedWith(value).build().verifiedWith());
    }

    @Test
    public void testVerificationDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Consent.ConsentVerification.create().verificationDate(value).build().verificationDate());
    }
}
