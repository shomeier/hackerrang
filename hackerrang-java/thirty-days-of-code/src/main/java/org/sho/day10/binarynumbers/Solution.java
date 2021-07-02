package org.sho.day10.binarynumbers;

import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

        var input = 439;

        var solution = new Solution();
        final Integer result = solution.process(input);

        System.out.println(result);
    }

    private Integer process(int input) {

        var pattern = "1+";
        var p = Pattern.compile(pattern);

        var binaryString = Integer.toBinaryString(input);
        return p.matcher(binaryString).results()
            .map(r -> r.group().length())
            .reduce(0, (r, i) -> (i > r) ? i:r);
    }
}
