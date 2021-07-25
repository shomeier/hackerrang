package org.sho.day23.bstlevelordertraversal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest extends AbstractSolutionTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void testOne(List<Integer> expected, List<Integer> input) {
        assertEquals(expected, Solution.getLevelOrder(buildBst(input)));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(List.of(3, 2, 5, 1, 4, 7), List.of(3, 5, 4, 7, 2, 1)),
                Arguments.of(List.of(4, 2, 6, 1, 3, 5, 7), List.of(4, 2, 1, 3, 6, 5, 7)),
                Arguments.of(List.of(5, 2, 6, 3, 4), List.of(5, 2, 3, 4, 6)));
    }
}
