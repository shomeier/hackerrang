package org.sho.day11.twodarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) throws IOException {
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        final var solution = new Solution();
        final var result = solution.maxSum(arr);

        System.out.println(result);

        bufferedReader.close();
    }

    private int maxSum(List<List<Integer>> arr) {

        return IntStream.range(0, 16)
            .reduce(Integer.MIN_VALUE, (result, element) -> {
                final var sumHourglass = sumHourglass(element / 4, element % 4, arr);
                return Math.max(result, sumHourglass);
            });
    }

    private int sumHourglass(int row, int col, List<List<Integer>> arr) {

        final var sumTop = Stream.of(1, 2)
            .reduce(arr.get(row).get(col), (result, element) -> result += arr.get(row).get(col + element));
        final var sumCenter = arr.get(row + 1).get(col + 1);
        final var sumBottom = Stream.of(1, 2)
            .reduce(arr.get(row + 2).get(col), (result, element) -> result += arr.get(row + 2).get(col + element));

        return sumTop + sumCenter + sumBottom;
    }
}
