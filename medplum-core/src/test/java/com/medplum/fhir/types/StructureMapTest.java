/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class StructureMapTest {

    @Test
    public void testResourceType() {
        assertEquals("x", StructureMap.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", StructureMap.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, StructureMap.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", StructureMap.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", StructureMap.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, StructureMap.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        assertEquals("x", StructureMap.create().url("x").build().url());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.create().identifier(value).build().identifier());
    }

    @Test
    public void testVersion() {
        assertEquals("x", StructureMap.create().version("x").build().version());
    }

    @Test
    public void testName() {
        assertEquals("x", StructureMap.create().name("x").build().name());
    }

    @Test
    public void testTitle() {
        assertEquals("x", StructureMap.create().title("x").build().title());
    }

    @Test
    public void testStatus() {
        assertEquals("x", StructureMap.create().status("x").build().status());
    }

    @Test
    public void testExperimental() {
        assertEquals(true, StructureMap.create().experimental(true).build().experimental());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, StructureMap.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", StructureMap.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.create().contact(value).build().contact());
    }

    @Test
    public void testDescription() {
        assertEquals("x", StructureMap.create().description("x").build().description());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testPurpose() {
        assertEquals("x", StructureMap.create().purpose("x").build().purpose());
    }

    @Test
    public void testCopyright() {
        assertEquals("x", StructureMap.create().copyright("x").build().copyright());
    }

    @Test
    public void testStructure() {
        final java.util.List<StructureMap.StructureMapStructure> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.create().structure(value).build().structure());
    }

    @Test
    public void testImportValue() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.create().importValue(value).build().importValue());
    }

    @Test
    public void testGroup() {
        final java.util.List<StructureMap.StructureMapGroup> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.create().group(value).build().group());
    }
}
