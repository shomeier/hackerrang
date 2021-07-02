package org.sho.day12.inheritance;

import java.util.Arrays;

public class Student extends Person {

    private int[] scores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    public Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.scores = scores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    public char calculate() {
        final double average = Arrays.stream(scores)
            .average()
            .orElse(0);

        if (isInRange(average, 90, 100)) {
            return 'O';
        }
        if (isInRange(average, 80, 90)) {
            return 'E';
        }
        if (isInRange(average, 70, 80)) {
            return 'A';
        }
        if (isInRange(average, 55, 70)) {
            return 'P';
        }
        if (isInRange(average, 40, 55)) {
            return 'D';
        }
        return 'T';
    }

    private static boolean isInRange(double x, int lower, int upper) {
        return lower <= x && x <= upper;
    }
}
