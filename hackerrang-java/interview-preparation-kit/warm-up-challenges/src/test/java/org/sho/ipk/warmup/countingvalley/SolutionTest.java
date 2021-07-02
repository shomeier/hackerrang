package org.sho.ipk.warmup.countingvalley;

import org.junit.jupiter.api.Test;
import org.sho.ipk.warmup.countingvalleys.Solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1Valley() {
        assertEquals(1, Solution.Result.countingValleys(8, "UDDDUDUU"));
        assertEquals(1, Solution.Result.countingValleys(6, "DUUUDD"));
    }

    @Test
    void test4Valleys() {
        assertEquals(4, Solution.Result.countingValleys(8, "DUDUDUDU"));
    }
}
