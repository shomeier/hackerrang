package org.sho.day23.bstlevelordertraversal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionRecursiveTest extends AbstractSolutionTest {

    @Test
    void testOne() {
        List<Integer> order = new ArrayList<>();
        SolutionRecursive.getLevelOrder(createBst(List.of(3, 5, 4, 7, 2, 1)), order);
        assertEquals(List.of(3, 2, 5, 1, 4, 7), order);
    }

    @Test
    void testTwo() {
        List<Integer> order = new ArrayList<>();
        SolutionRecursive.getLevelOrder(createBst(List.of(4, 2, 1, 3, 6, 5, 7)), order);
        assertEquals(List.of(4, 2, 6, 1, 3, 5, 7), order);
    }

    @Test
    void testThree() {
        List<Integer> order = new ArrayList<>();
        SolutionRecursive.getLevelOrder(createBst(List.of(5, 2, 3, 4, 6)), order);
        assertEquals(List.of(5, 2, 6, 3, 4), order);
    }
}
