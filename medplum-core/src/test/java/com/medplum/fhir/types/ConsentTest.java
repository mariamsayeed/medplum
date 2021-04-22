/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ConsentTest {

    @Test
    public void testResourceType() {
        assertEquals("x", Consent.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", Consent.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Consent.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", Consent.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Consent.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Consent.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Consent.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Consent.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Consent.create().identifier(value).build().identifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", Consent.create().status("x").build().status());
    }

    @Test
    public void testScope() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Consent.create().scope(value).build().scope());
    }

    @Test
    public void testCategory() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Consent.create().category(value).build().category());
    }

    @Test
    public void testPatient() {
        final Reference value = Reference.create().build();
        assertEquals(value, Consent.create().patient(value).build().patient());
    }

    @Test
    public void testDateTime() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Consent.create().dateTime(value).build().dateTime());
    }

    @Test
    public void testPerformer() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Consent.create().performer(value).build().performer());
    }

    @Test
    public void testOrganization() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Consent.create().organization(value).build().organization());
    }

    @Test
    public void testSourceAttachment() {
        final Attachment value = Attachment.create().build();
        assertEquals(value, Consent.create().sourceAttachment(value).build().sourceAttachment());
    }

    @Test
    public void testSourceReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Consent.create().sourceReference(value).build().sourceReference());
    }

    @Test
    public void testPolicy() {
        final java.util.List<Consent.ConsentPolicy> value = java.util.Collections.emptyList();
        assertEquals(value, Consent.create().policy(value).build().policy());
    }

    @Test
    public void testPolicyRule() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Consent.create().policyRule(value).build().policyRule());
    }

    @Test
    public void testVerification() {
        final java.util.List<Consent.ConsentVerification> value = java.util.Collections.emptyList();
        assertEquals(value, Consent.create().verification(value).build().verification());
    }

    @Test
    public void testProvision() {
        final Consent.ConsentProvision value = Consent.ConsentProvision.create().build();
        assertEquals(value, Consent.create().provision(value).build().provision());
    }
}
