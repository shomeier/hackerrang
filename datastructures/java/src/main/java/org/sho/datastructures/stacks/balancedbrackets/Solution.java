// https://www.hackerrank.com/challenges/balanced-brackets/problem
package org.sho.datastructures.stacks.balancedbrackets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String isBalanced(String s) {

        List<Character> openingBrackets = List.of('[', '{', '(');
        List<Character> closingBrackets = List.of(']', '}', ')');

        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (openingBrackets.contains(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                Character poppedChar = stack.pop();
                // popped char must be the corresponding opening bracket of current char
                if ((!openingBrackets.contains(poppedChar)) ||
                        (!c.equals(closingBrackets.get(openingBrackets.indexOf(poppedChar))))) {
                    return "NO";
                }
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        }
        return "NO";
    }

    public static String isBalancedWithoutUsingStack(String s) {

        String tmp = s;
        String beforeReplacement;
        do {
            beforeReplacement = tmp;
            tmp = tmp.replace("()", "");
            tmp = tmp.replace("[]", "");
            tmp = tmp.replace("{}", "");
        } while (tmp.length() < beforeReplacement.length());

        return tmp.length() == 0 ? "YES" : "NO";
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
