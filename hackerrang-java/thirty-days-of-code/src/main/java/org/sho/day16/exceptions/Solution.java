package org.sho.day16.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        try (var bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            String s = bufferedReader.readLine();
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {

            System.out.println("Bad String");
        }
    }
}
