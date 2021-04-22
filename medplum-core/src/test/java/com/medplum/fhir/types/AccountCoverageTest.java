/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class AccountCoverageTest {

    @Test
    public void testId() {
        assertEquals("x", Account.AccountCoverage.create().id("x").build().id());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Account.AccountCoverage.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCoverage() {
        final Reference value = Reference.create().build();
        assertEquals(value, Account.AccountCoverage.create().coverage(value).build().coverage());
    }

    @Test
    public void testPriority() {
        assertEquals(1, Account.AccountCoverage.create().priority(1).build().priority());
    }
}
