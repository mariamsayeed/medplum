/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class PeriodTest {

    @Test
    public void testId() {
        assertEquals("x", Period.create().id("x").build().id());
    }

    @Test
    public void testStart() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Period.create().start(value).build().start());
    }

    @Test
    public void testEnd() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Period.create().end(value).build().end());
    }
}
