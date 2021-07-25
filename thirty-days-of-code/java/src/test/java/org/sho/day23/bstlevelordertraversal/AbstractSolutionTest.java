package org.sho.day23.bstlevelordertraversal;

import java.util.List;

public abstract class AbstractSolutionTest {

    protected Node createBst(List<Integer> data) {
        return data.stream()
                .reduce(null, Solution::insert, (u, t) -> {
                    throw new RuntimeException("No combiner for parallel streams provided");
                });
    }
}
