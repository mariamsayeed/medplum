/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class EncounterParticipantTest {

    @Test
    public void testId() {
        assertEquals("x", Encounter.EncounterParticipant.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Encounter.EncounterParticipant.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Encounter.EncounterParticipant.create().type(value).build().type());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Encounter.EncounterParticipant.create().period(value).build().period());
    }

    @Test
    public void testIndividual() {
        final Reference value = Reference.create().build();
        assertEquals(value, Encounter.EncounterParticipant.create().individual(value).build().individual());
    }
}
