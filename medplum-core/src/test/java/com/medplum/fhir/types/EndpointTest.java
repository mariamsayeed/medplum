/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class EndpointTest {

    @Test
    public void testResourceType() {
        assertEquals("x", Endpoint.create().resourceType("x").build().resourceType());
    }

    @Test
    public void testId() {
        assertEquals("x", Endpoint.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Endpoint.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        assertEquals("x", Endpoint.create().implicitRules("x").build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Endpoint.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Endpoint.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Endpoint.create().contained(value).build().contained());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Endpoint.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Endpoint.create().identifier(value).build().identifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", Endpoint.create().status("x").build().status());
    }

    @Test
    public void testConnectionType() {
        final Coding value = Coding.create().build();
        assertEquals(value, Endpoint.create().connectionType(value).build().connectionType());
    }

    @Test
    public void testName() {
        assertEquals("x", Endpoint.create().name("x").build().name());
    }

    @Test
    public void testManagingOrganization() {
        final Reference value = Reference.create().build();
        assertEquals(value, Endpoint.create().managingOrganization(value).build().managingOrganization());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactPoint> value = java.util.Collections.emptyList();
        assertEquals(value, Endpoint.create().contact(value).build().contact());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Endpoint.create().period(value).build().period());
    }

    @Test
    public void testPayloadType() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Endpoint.create().payloadType(value).build().payloadType());
    }

    @Test
    public void testPayloadMimeType() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, Endpoint.create().payloadMimeType(value).build().payloadMimeType());
    }

    @Test
    public void testAddress() {
        assertEquals("x", Endpoint.create().address("x").build().address());
    }

    @Test
    public void testHeader() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, Endpoint.create().header(value).build().header());
    }
}
