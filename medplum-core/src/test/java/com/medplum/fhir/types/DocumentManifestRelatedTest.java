/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class DocumentManifestRelatedTest {

    @Test
    public void testId() {
        assertEquals("x", DocumentManifest.DocumentManifestRelated.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentManifest.DocumentManifestRelated.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, DocumentManifest.DocumentManifestRelated.create().identifier(value).build().identifier());
    }

    @Test
    public void testRef() {
        final Reference value = Reference.create().build();
        assertEquals(value, DocumentManifest.DocumentManifestRelated.create().ref(value).build().ref());
    }
}
