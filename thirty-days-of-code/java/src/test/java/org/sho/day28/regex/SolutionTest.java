package org.sho.day28.regex;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        List<String> data = List.of("riya riya@gmail.com",
                "julia julia@julia.me",
                "julia sjulia@gmail.com",
                "julia julia@gmail.com",
                "samantha samantha@gmail.com",
                "tanya tanya@gmail.com");

        List<String> expected = List.of("julia",
                "julia",
                "riya",
                "samantha",
                "tanya");

        assertEquals(expected, Solution.filterPeople(data));
    }

}
