/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class BinaryTest {

    @Test
    public void testResourceType() {
        assertEquals("x", Binary.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", Binary.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Binary.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", Binary.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Binary.create().language("x").build().language());
    }

    @Test
    public void testContentType() {
        assertEquals("x", Binary.create().contentType("x").build().contentType());
    }

    @Test
    public void testSecurityContext() {
        final Reference value = Reference.create().build();
        assertEquals(value, Binary.create().securityContext(value).build().securityContext());
    }

    @Test
    public void testData() {
        assertEquals("x", Binary.create().data("x").build().data());
    }
}
