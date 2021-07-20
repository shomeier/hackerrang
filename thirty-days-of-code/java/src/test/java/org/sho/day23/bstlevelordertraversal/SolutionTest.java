package org.sho.day23.bstlevelordertraversal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        assertEquals(List.of(3, 2, 5, 1, 4, 7), Solution.getLevelOrder(buildBst(List.of(3, 5, 4, 7, 2, 1))));
    }

    private Node buildBst(List<Integer> data) {
        return data.stream()
                .reduce(null, (r, e) -> Solution.insert((Node) r, e.intValue()), (r, s) -> {
                    throw new RuntimeException("Combining in parfallel streams not supported!");
                });
    }
}
