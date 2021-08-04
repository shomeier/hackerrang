package org.sho.day28.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (var bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            int N = Integer.parseInt(bufferedReader.readLine().trim());
            List<String> lines = bufferedReader.lines().limit(N).collect(Collectors.toList());
            filterPeople(lines).forEach(System.out::println);
        }
    }

    static List<String> filterPeople(List<String> lines) {

        Pattern pattern = Pattern.compile("[a-z]+@gmail.com");
        return lines.stream()
                .filter(s -> pattern.matcher(s).find())
                .map(s -> s.replaceAll("\\s+$", "").split(" ")[0])
                .sorted()
                .collect(Collectors.toList());
    }
}
