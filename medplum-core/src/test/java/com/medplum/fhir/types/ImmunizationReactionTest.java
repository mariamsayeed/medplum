/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ImmunizationReactionTest {

    @Test
    public void testId() {
        assertEquals("x", Immunization.ImmunizationReaction.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Immunization.ImmunizationReaction.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Immunization.ImmunizationReaction.create().date(value).build().date());
    }

    @Test
    public void testDetail() {
        final Reference value = Reference.create().build();
        assertEquals(value, Immunization.ImmunizationReaction.create().detail(value).build().detail());
    }

    @Test
    public void testReported() {
        assertEquals(true, Immunization.ImmunizationReaction.create().reported(true).build().reported());
    }
}
