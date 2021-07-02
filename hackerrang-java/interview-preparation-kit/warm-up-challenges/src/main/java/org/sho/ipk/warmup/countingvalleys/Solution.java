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

            int level = 0, numberOfValleys = 0;
            for (int i = 0; i < path.length(); i++) {
                if (path.charAt(i) == 'D') {
                    if (level == 0) {
                        numberOfValleys++;
                    }
                    level--;
                } else {
                    level++;
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
