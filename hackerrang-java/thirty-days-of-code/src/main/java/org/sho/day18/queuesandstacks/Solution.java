package org.sho.day18.queuesandstacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    // Write your code here.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Create a Solution object:
        Solution p = new Solution(input);

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
            + ((!p.isPalindrome()) ? "not a palindrome." : "a palindrome."));
    }

    private final String input;

    private final Stack<Character> stack = new Stack();
    // LinkedList implements Queue interface
    private final Queue<Character> queue = new LinkedList();

    Solution(String input) {
        this.input = input;
    }

    boolean isPalindrome() {

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            pushCharacter(c);
            enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        for (int i = 0; i < s.length / 2; i++) {
            if (popCharacter() != dequeueCharacter()) {
                return false;
            }
        }

        return true;
    }

    void pushCharacter(char c) {
        stack.push(c);
    }

    char popCharacter() {
        return stack.pop();
    }

    void enqueueCharacter(char c) {
        queue.add(c);
    }

    char dequeueCharacter() {
        return queue.remove();
    }
}
