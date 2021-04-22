/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class HumanNameTest {

    @Test
    public void testId() {
        assertEquals("x", HumanName.create().id("x").build().id());
    }

    @Test
    public void testUse() {
        assertEquals("x", HumanName.create().use("x").build().use());
    }

    @Test
    public void testText() {
        assertEquals("x", HumanName.create().text("x").build().text());
    }

    @Test
    public void testFamily() {
        assertEquals("x", HumanName.create().family("x").build().family());
    }

    @Test
    public void testGiven() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, HumanName.create().given(value).build().given());
    }

    @Test
    public void testPrefix() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, HumanName.create().prefix(value).build().prefix());
    }

    @Test
    public void testSuffix() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, HumanName.create().suffix(value).build().suffix());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, HumanName.create().period(value).build().period());
    }
}
