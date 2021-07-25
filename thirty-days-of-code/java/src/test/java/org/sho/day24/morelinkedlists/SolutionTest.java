package org.sho.day24.morelinkedlists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    @Test
    void testNull() {
        assertNull(Solution.removeDuplicates(null));
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void test(List<Integer> expected, List<Integer> input) {
        assertEquals(expected, toList(Solution.removeDuplicates(createBst(input))));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(List.of(), List.of()),
                Arguments.of(List.of(1, 2, 3, 4), List.of(1, 2, 2, 3, 3, 4)),
                Arguments.of(List.of(1), List.of(1, 1, 1, 1, 1, 1, 1, 1)),
                Arguments.of(List.of(5, 6, 13, 14), List.of(5, 6, 13, 14, 14)));
    }

    private Node createBst(List<Integer> data) {
        return data.stream()
                .reduce(null, Solution::insert, (u, t) -> {
                    throw new RuntimeException("No combiner for parallel streams provided");
                });
    }


    private List<Integer> toList(Node node) {
        List<Integer> retVal = new LinkedList<>();

        Node currentNode = node;
        while (currentNode != null) {
            retVal.add(currentNode.data);
            currentNode = currentNode.next;
        }

        return retVal;
    }
}
