package org.sho.day25.runningtimeandcomplexity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void test(boolean expected, int input) {

        assertEquals(expected, Solution.isPrime(input), String.format("Expected %s for %d", expected, input));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(false, 1),
                Arguments.of(false, 12),
                Arguments.of(true, 5),
                Arguments.of(true, 7),
                Arguments.of(true, 7907));
    }

}
