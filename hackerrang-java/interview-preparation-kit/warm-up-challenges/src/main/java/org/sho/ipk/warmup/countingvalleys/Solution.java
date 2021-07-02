package org.sho.ipk.warmup.countingvalleys;

import java.io.*;
import java.util.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static class Result {

        /*
         * Complete the 'countingValleys' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER steps
         *  2. STRING path
         */
        public static int countingValleys(int steps, String path) {

            final List<String> stepList = path.codePoints()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(toList());

            int level = 0, numberOfValleys = 0;
            boolean currentlyInValley = false;
            for (String step : stepList) {
                if (level == 0) {
                    currentlyInValley = step.equals("D");
                }
                level = (step.equals("D")) ? (level - 1) : (level + 1);
                if (level == 0 && currentlyInValley) {
                    numberOfValleys++;
                }
            }

            return numberOfValleys;
        }
    }

    public static void main(String[] args) throws IOException {

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {

            int steps = Integer.parseInt(bufferedReader.readLine().trim());

            String path = bufferedReader.readLine();

            int result = Result.countingValleys(steps, path);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
    }
}
