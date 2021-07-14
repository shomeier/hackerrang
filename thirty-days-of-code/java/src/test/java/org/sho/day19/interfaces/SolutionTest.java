package org.sho.day19.interfaces;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    AdvancedArithmetic out = new Calculator();

    @ParameterizedTest
    @MethodSource("provideData")
    void test25(int input, int expected) {
        assertEquals(expected, out.divisorSum(input));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(25, 31),
                Arguments.of(20, 42));
    }
}
