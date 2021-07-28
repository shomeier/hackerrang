// https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
package org.sho.day25.runningtimeandcomplexity;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named
         * Solution.
         */
        try (var scanner = new Scanner(System.in)) {
            int T = scanner.nextInt();
            while (T-- > 0) {
                var input = scanner.nextInt();
                var result = isPrime(input) ? "Prime" : "Not prime";
                System.out.println(result);
            }
        }
    }

    static boolean isPrime(int x) {
        if (x == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if ((x % i) == 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isPrimeLinear(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }

        return true;
    }
}
