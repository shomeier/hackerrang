package org.sho.day18.queuesandstacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void testPositive() {
        Solution out = new Solution("racecar");
        assertTrue(out.isPalindrome());
    }

    @Test
    void testNegative() {
        Solution out = new Solution("pillepalle");
        assertFalse(out.isPalindrome());
    }
}
