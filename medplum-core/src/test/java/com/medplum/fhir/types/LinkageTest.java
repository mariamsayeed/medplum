/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class LinkageTest {

    @Test
    public void testResourceType() {
        assertEquals("x", Linkage.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", Linkage.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Linkage.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", Linkage.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Linkage.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Linkage.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Linkage.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Linkage.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testActive() {
        assertEquals(true, Linkage.create().active(true).build().active());
    }

    @Test
    public void testAuthor() {
        final Reference value = Reference.create().build();
        assertEquals(value, Linkage.create().author(value).build().author());
    }

    @Test
    public void testItem() {
        final java.util.List<Linkage.LinkageItem> value = java.util.Collections.emptyList();
        assertEquals(value, Linkage.create().item(value).build().item());
    }
}
