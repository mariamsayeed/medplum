/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class MessageDefinitionAllowedResponseTest {

    @Test
    public void testId() {
        assertEquals("x", MessageDefinition.MessageDefinitionAllowedResponse.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MessageDefinition.MessageDefinitionAllowedResponse.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testMessage() {
        assertEquals("x", MessageDefinition.MessageDefinitionAllowedResponse.create().message("x").build().message());
    }

    @Test
    public void testSituation() {
        assertEquals("x", MessageDefinition.MessageDefinitionAllowedResponse.create().situation("x").build().situation());
    }
}
