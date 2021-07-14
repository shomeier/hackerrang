package org.sho.day20.sorting;

import static java.util.stream.Collectors.toList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) throws IOException {

        try (var bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            // Write your code here
            SortResult result = sort(a);
            List<Integer> sortedArray = result.getSortedArray();
            System.out.println(String.format("Array is sorted in %d swaps.", result.getNumberOfSwaps()));
            System.out.println(String.format("First Element: %d", sortedArray.get(0)));
            System.out.println(String.format("Last Element: %d", sortedArray.get(sortedArray.size() - 1)));

        }
    }

    static SortResult sort(List<Integer> toSort) {

        int numberOfSwaps;
        int numberOfTotalSwaps = 0;

        List<Integer> sorted = new ArrayList<>(toSort);
        do {
            numberOfSwaps = 0;
            for (int j = 0; j < sorted.size() - 1; j++) {
                if (sorted.get(j) > sorted.get(j + 1)) {
                    int temp = sorted.get(j + 1);
                    sorted.set(j + 1, sorted.get(j));
                    sorted.set(j, temp);

                    numberOfSwaps++;
                }
            }
            numberOfTotalSwaps += numberOfSwaps;
        } while (numberOfSwaps > 0);

        return new SortResult(numberOfTotalSwaps, sorted);
    }

    static class SortResult {
        private final int numberOfSwaps;
        private final List<Integer> sortedArray;

        public SortResult(int numberOfSwaps, List<Integer> sortedArray) {
            this.numberOfSwaps = numberOfSwaps;
            this.sortedArray = sortedArray;
        }

        public int getNumberOfSwaps() {
            return numberOfSwaps;
        }

        public List<Integer> getSortedArray() {
            return sortedArray;
        }
    }
}

