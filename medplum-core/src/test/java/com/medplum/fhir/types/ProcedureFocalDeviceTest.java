/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ProcedureFocalDeviceTest {

    @Test
    public void testId() {
        assertEquals("x", Procedure.ProcedureFocalDevice.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Procedure.ProcedureFocalDevice.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testAction() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Procedure.ProcedureFocalDevice.create().action(value).build().action());
    }

    @Test
    public void testManipulated() {
        final Reference value = Reference.create().build();
        assertEquals(value, Procedure.ProcedureFocalDevice.create().manipulated(value).build().manipulated());
    }
}
