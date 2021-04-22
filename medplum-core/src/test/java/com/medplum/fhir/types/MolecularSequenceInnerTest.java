/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class MolecularSequenceInnerTest {

    @Test
    public void testId() {
        assertEquals("x", MolecularSequence.MolecularSequenceInner.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MolecularSequence.MolecularSequenceInner.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testStart() {
        assertEquals(1, MolecularSequence.MolecularSequenceInner.create().start(1).build().start());
    }

    @Test
    public void testEnd() {
        assertEquals(1, MolecularSequence.MolecularSequenceInner.create().end(1).build().end());
    }
}
