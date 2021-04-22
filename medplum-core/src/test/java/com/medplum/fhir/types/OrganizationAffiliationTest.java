/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class OrganizationAffiliationTest {

    @Test
    public void testResourceType() {
        assertEquals("x", OrganizationAffiliation.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", OrganizationAffiliation.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, OrganizationAffiliation.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", OrganizationAffiliation.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", OrganizationAffiliation.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, OrganizationAffiliation.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, OrganizationAffiliation.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, OrganizationAffiliation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, OrganizationAffiliation.create().identifier(value).build().identifier());
    }

    @Test
    public void testActive() {
        assertEquals(true, OrganizationAffiliation.create().active(true).build().active());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, OrganizationAffiliation.create().period(value).build().period());
    }

    @Test
    public void testOrganization() {
        final Reference value = Reference.create().build();
        assertEquals(value, OrganizationAffiliation.create().organization(value).build().organization());
    }

    @Test
    public void testParticipatingOrganization() {
        final Reference value = Reference.create().build();
        assertEquals(value, OrganizationAffiliation.create().participatingOrganization(value).build().participatingOrganization());
    }

    @Test
    public void testNetwork() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, OrganizationAffiliation.create().network(value).build().network());
    }

    @Test
    public void testCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, OrganizationAffiliation.create().code(value).build().code());
    }

    @Test
    public void testSpecialty() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, OrganizationAffiliation.create().specialty(value).build().specialty());
    }

    @Test
    public void testLocation() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, OrganizationAffiliation.create().location(value).build().location());
    }

    @Test
    public void testHealthcareService() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, OrganizationAffiliation.create().healthcareService(value).build().healthcareService());
    }

    @Test
    public void testTelecom() {
        final java.util.List<ContactPoint> value = java.util.Collections.emptyList();
        assertEquals(value, OrganizationAffiliation.create().telecom(value).build().telecom());
    }

    @Test
    public void testEndpoint() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, OrganizationAffiliation.create().endpoint(value).build().endpoint());
    }
}
