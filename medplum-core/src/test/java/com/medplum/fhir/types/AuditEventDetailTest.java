/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class AuditEventDetailTest {

    @Test
    public void testId() {
        assertEquals("x", AuditEvent.AuditEventDetail.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, AuditEvent.AuditEventDetail.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        assertEquals("x", AuditEvent.AuditEventDetail.create().type("x").build().type());
    }

    @Test
    public void testValueString() {
        assertEquals("x", AuditEvent.AuditEventDetail.create().valueString("x").build().valueString());
    }

    @Test
    public void testValueBase64Binary() {
        assertEquals("x", AuditEvent.AuditEventDetail.create().valueBase64Binary("x").build().valueBase64Binary());
    }
}
