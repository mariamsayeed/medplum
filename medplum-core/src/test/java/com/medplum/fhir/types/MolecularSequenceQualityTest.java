/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class MolecularSequenceQualityTest {

    @Test
    public void testId() {
        assertEquals("x", MolecularSequence.MolecularSequenceQuality.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceQuality.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        assertEquals("x", MolecularSequence.MolecularSequenceQuality.create().type("x").build().type());
    }

    @Test
    public void testStandardSequence() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MolecularSequence.MolecularSequenceQuality.create().standardSequence(value).build().standardSequence());
    }

    @Test
    public void testStart() {
        assertEquals(1, MolecularSequence.MolecularSequenceQuality.create().start(1).build().start());
    }

    @Test
    public void testEnd() {
        assertEquals(1, MolecularSequence.MolecularSequenceQuality.create().end(1).build().end());
    }

    @Test
    public void testScore() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, MolecularSequence.MolecularSequenceQuality.create().score(value).build().score());
    }

    @Test
    public void testMethod() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MolecularSequence.MolecularSequenceQuality.create().method(value).build().method());
    }

    @Test
    public void testTruthTP() {
        assertEquals(1.0, MolecularSequence.MolecularSequenceQuality.create().truthTP(1.0).build().truthTP());
    }

    @Test
    public void testQueryTP() {
        assertEquals(1.0, MolecularSequence.MolecularSequenceQuality.create().queryTP(1.0).build().queryTP());
    }

    @Test
    public void testTruthFN() {
        assertEquals(1.0, MolecularSequence.MolecularSequenceQuality.create().truthFN(1.0).build().truthFN());
    }

    @Test
    public void testQueryFP() {
        assertEquals(1.0, MolecularSequence.MolecularSequenceQuality.create().queryFP(1.0).build().queryFP());
    }

    @Test
    public void testGtFP() {
        assertEquals(1.0, MolecularSequence.MolecularSequenceQuality.create().gtFP(1.0).build().gtFP());
    }

    @Test
    public void testPrecision() {
        assertEquals(1.0, MolecularSequence.MolecularSequenceQuality.create().precision(1.0).build().precision());
    }

    @Test
    public void testRecall() {
        assertEquals(1.0, MolecularSequence.MolecularSequenceQuality.create().recall(1.0).build().recall());
    }

    @Test
    public void testFScore() {
        assertEquals(1.0, MolecularSequence.MolecularSequenceQuality.create().fScore(1.0).build().fScore());
    }

    @Test
    public void testRoc() {
        final MolecularSequence.MolecularSequenceRoc value = MolecularSequence.MolecularSequenceRoc.create().build();
        assertEquals(value, MolecularSequence.MolecularSequenceQuality.create().roc(value).build().roc());
    }
}
