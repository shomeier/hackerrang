package org.sho.datastructures.stacks.balancedbrackets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void test(String expected, String input) {

        assertEquals(expected, Result.isBalanced(input), String.format("Input: %s", input));
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void testWithoutStack(String expected, String input) {

        assertEquals(expected, Result.isBalancedWithoutUsingStack(input), String.format("Input: %s", input));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of("YES", "{[()]}"),
                Arguments.of("NO", "{[(])}"),
                Arguments.of("YES", "{{[[(())]]}}"),
                Arguments.of("NO", "}{"),
                Arguments.of("NO", ")("),
                Arguments.of("NO", ")()}{()[]"),
                Arguments.of("NO", "(}}}"),
                Arguments.of("NO", "{{}("),
                Arguments.of("YES",
                        "[()][{}()][](){}([{}(())([[{}]])][])[]([][])(){}{{}{[](){}}}()[]({})[{}{{}([{}][])}]"),
                Arguments.of("NO",
                        "((]()(]([({]}({[)){}}[}({[{])(]{()[]}}{)}}]]{({)[}{("));
    }
}
