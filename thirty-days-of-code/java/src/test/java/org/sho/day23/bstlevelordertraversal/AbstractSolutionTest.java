package org.sho.day23.bstlevelordertraversal;

import java.util.List;

public abstract class AbstractSolutionTest {

    protected Node buildBst(List<Integer> data) {
        return data.stream()
                .reduce(null, (r, e) -> Solution.insert((Node) r, e.intValue()), (r, s) -> {
                    throw new RuntimeException("Combining in parfallel streams not supported!");
                });
    }
}
