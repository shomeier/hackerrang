package org.sho.day26.nestedlogic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    @ParameterizedTest
    @MethodSource()
    void test(int expected, LocalDate dateReturned, LocalDate dateDue) {
        assertEquals(expected, Solution.getFine(dateReturned, dateDue));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(0, LocalDate.of(2015, 6, 9), LocalDate.of(2015, 6, 9)),
                Arguments.of(0, LocalDate.of(2015, 6, 9), LocalDate.of(2016, 6, 9)),
                Arguments.of(45, LocalDate.of(2015, 6, 9), LocalDate.of(2015, 6, 6)));
    }
}
