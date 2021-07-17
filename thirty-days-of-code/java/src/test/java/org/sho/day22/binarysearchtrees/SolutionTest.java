package org.sho.day22.binarysearchtrees;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Node node = createBst(List.of(3, 5, 2, 1, 4, 6, 7));
        assertEquals(3, Solution.getHeight(node));
    }

    private Node createBst(List<Integer> data) {
        return data.stream()
                .reduce(null, Solution::insert, (u, t) -> {
                    throw new RuntimeException("No combiner for parallel streams provided");
                });
    }
}
