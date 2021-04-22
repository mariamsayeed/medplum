/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class QuantityTest {

    @Test
    public void testId() {
        assertEquals("x", Quantity.create().id("x").build().id());
    }

    @Test
    public void testValue() {
        assertEquals(1.0, Quantity.create().value(1.0).build().value());
    }

    @Test
    public void testComparator() {
        assertEquals("x", Quantity.create().comparator("x").build().comparator());
    }

    @Test
    public void testUnit() {
        assertEquals("x", Quantity.create().unit("x").build().unit());
    }

    @Test
    public void testSystem() {
        assertEquals("x", Quantity.create().system("x").build().system());
    }

    @Test
    public void testCode() {
        assertEquals("x", Quantity.create().code("x").build().code());
    }
}
