/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class GoalTest {

    @Test
    public void testResourceType() {
        assertEquals("x", Goal.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", Goal.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Goal.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", Goal.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Goal.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Goal.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Goal.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Goal.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Goal.create().identifier(value).build().identifier());
    }

    @Test
    public void testLifecycleStatus() {
        assertEquals("x", Goal.create().lifecycleStatus("x").build().lifecycleStatus());
    }

    @Test
    public void testAchievementStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Goal.create().achievementStatus(value).build().achievementStatus());
    }

    @Test
    public void testCategory() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Goal.create().category(value).build().category());
    }

    @Test
    public void testPriority() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Goal.create().priority(value).build().priority());
    }

    @Test
    public void testDescription() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Goal.create().description(value).build().description());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, Goal.create().subject(value).build().subject());
    }

    @Test
    public void testStartDate() {
        assertEquals("x", Goal.create().startDate("x").build().startDate());
    }

    @Test
    public void testStartCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Goal.create().startCodeableConcept(value).build().startCodeableConcept());
    }

    @Test
    public void testTarget() {
        final java.util.List<Goal.GoalTarget> value = java.util.Collections.emptyList();
        assertEquals(value, Goal.create().target(value).build().target());
    }

    @Test
    public void testStatusDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Goal.create().statusDate(value).build().statusDate());
    }

    @Test
    public void testStatusReason() {
        assertEquals("x", Goal.create().statusReason("x").build().statusReason());
    }

    @Test
    public void testExpressedBy() {
        final Reference value = Reference.create().build();
        assertEquals(value, Goal.create().expressedBy(value).build().expressedBy());
    }

    @Test
    public void testAddresses() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Goal.create().addresses(value).build().addresses());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, Goal.create().note(value).build().note());
    }

    @Test
    public void testOutcomeCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Goal.create().outcomeCode(value).build().outcomeCode());
    }

    @Test
    public void testOutcomeReference() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Goal.create().outcomeReference(value).build().outcomeReference());
    }
}
