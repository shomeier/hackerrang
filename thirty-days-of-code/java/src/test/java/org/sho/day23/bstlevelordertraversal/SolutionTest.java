package org.sho.day23.bstlevelordertraversal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest extends AbstractSolutionTest {

    @Test
    void testOne() {
        assertEquals(List.of(3, 2, 5, 1, 4, 7), Solution.getLevelOrder(buildBst(List.of(3, 5, 4, 7, 2, 1))));
    }

    @Test
    void testTwo() {
        assertEquals(List.of(4, 2, 6, 1, 3, 5, 7), Solution.getLevelOrder(buildBst(List.of(4, 2, 1, 3, 6, 5, 7))));
    }

    @Test
    void testThree() {
        assertEquals(List.of(5, 2, 6, 3, 4), Solution.getLevelOrder(buildBst(List.of(5, 2, 3, 4, 6))));
    }
}
