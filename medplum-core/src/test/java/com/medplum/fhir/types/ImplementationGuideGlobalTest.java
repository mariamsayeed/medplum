/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ImplementationGuideGlobalTest {

    @Test
    public void testId() {
        assertEquals("x", ImplementationGuide.ImplementationGuideGlobal.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImplementationGuide.ImplementationGuideGlobal.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        assertEquals("x", ImplementationGuide.ImplementationGuideGlobal.create().type("x").build().type());
    }

    @Test
    public void testProfile() {
        assertEquals("x", ImplementationGuide.ImplementationGuideGlobal.create().profile("x").build().profile());
    }
}
