package org.sho.day20.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.sho.day20.sorting.Solution.SortResult;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void test(List<Integer> input, int expectedNumberOfSwaps, List<Integer> expected) {

        SortResult result = Solution.sort(input);
        assertEquals(expected, result.getSortedArray());
        assertEquals(expectedNumberOfSwaps, result.getNumberOfSwaps());
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(List.of(3, 2, 1), 3, List.of(1, 2, 3)),
                Arguments.of(List.of(5, 3, 77, 8), 2, List.of(3, 5, 8, 77)));
    }
}
