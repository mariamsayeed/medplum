/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class EpisodeOfCareTest {

    @Test
    public void testResourceType() {
        assertEquals("x", EpisodeOfCare.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", EpisodeOfCare.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, EpisodeOfCare.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", EpisodeOfCare.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", EpisodeOfCare.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, EpisodeOfCare.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, EpisodeOfCare.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, EpisodeOfCare.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, EpisodeOfCare.create().identifier(value).build().identifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", EpisodeOfCare.create().status("x").build().status());
    }

    @Test
    public void testStatusHistory() {
        final java.util.List<EpisodeOfCare.EpisodeOfCareStatusHistory> value = java.util.Collections.emptyList();
        assertEquals(value, EpisodeOfCare.create().statusHistory(value).build().statusHistory());
    }

    @Test
    public void testType() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, EpisodeOfCare.create().type(value).build().type());
    }

    @Test
    public void testDiagnosis() {
        final java.util.List<EpisodeOfCare.EpisodeOfCareDiagnosis> value = java.util.Collections.emptyList();
        assertEquals(value, EpisodeOfCare.create().diagnosis(value).build().diagnosis());
    }

    @Test
    public void testPatient() {
        final Reference value = Reference.create().build();
        assertEquals(value, EpisodeOfCare.create().patient(value).build().patient());
    }

    @Test
    public void testManagingOrganization() {
        final Reference value = Reference.create().build();
        assertEquals(value, EpisodeOfCare.create().managingOrganization(value).build().managingOrganization());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, EpisodeOfCare.create().period(value).build().period());
    }

    @Test
    public void testReferralRequest() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, EpisodeOfCare.create().referralRequest(value).build().referralRequest());
    }

    @Test
    public void testCareManager() {
        final Reference value = Reference.create().build();
        assertEquals(value, EpisodeOfCare.create().careManager(value).build().careManager());
    }

    @Test
    public void testTeam() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, EpisodeOfCare.create().team(value).build().team());
    }

    @Test
    public void testAccount() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, EpisodeOfCare.create().account(value).build().account());
    }
}
