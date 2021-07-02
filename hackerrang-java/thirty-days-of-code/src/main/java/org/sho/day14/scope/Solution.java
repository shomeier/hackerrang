package org.sho.day14.scope;

import java.util.*;
import java.util.stream.Collectors;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    // Add your code here
    public void computeDifference() {
        final List<Integer> sorted = Arrays.stream(elements)
            .sorted()
            .boxed()
            .collect(Collectors.toList());

        // the max difference is between the lowest and highest value
        this.maximumDifference = Math.abs(sorted.get(0) - sorted.get(sorted.size() - 1));
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);
        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
