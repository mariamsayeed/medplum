/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class TestReportAction2Test {

    @Test
    public void testId() {
        assertEquals("x", TestReport.TestReportAction2.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestReport.TestReportAction2.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testOperation() {
        final TestReport.TestReportOperation value = TestReport.TestReportOperation.create().build();
        assertEquals(value, TestReport.TestReportAction2.create().operation(value).build().operation());
    }
}
