package org.sho.day19.interfaces;

import java.util.Scanner;
import java.util.stream.IntStream;

interface AdvancedArithmetic {
    int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        return IntStream.iterate(1, e -> e <= Math.sqrt(n), e -> e + 1)
                .flatMap(e -> (n % e == 0) ? IntStream.of(e, n / e) : IntStream.empty())
                .distinct()
                .sum();
    }
}


class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
