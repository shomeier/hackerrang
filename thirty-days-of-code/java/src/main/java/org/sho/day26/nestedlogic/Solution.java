package org.sho.day26.nestedlogic;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/30-nested-logic/problem
public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named
         * Solution.
         */
        try (var scanner = new Scanner(System.in)) {
            var dayReturned = scanner.nextInt();
            var monthReturned = scanner.nextInt();
            var yearReturned = scanner.nextInt();
            scanner.nextLine();

            var dayDue = scanner.nextInt();
            var monthDue = scanner.nextInt();
            var yearDue = scanner.nextInt();

            LocalDate dateReturned = LocalDate.of(yearReturned, monthReturned, dayReturned);
            LocalDate dateDue = LocalDate.of(yearDue, monthDue, dayDue);

            System.out.println(getFine(dateReturned, dateDue));
        }
    }

    static int getFine(LocalDate dateReturned, LocalDate dateDue) {

        if (dateReturned.isAfter(dateDue)) {
            if (YearMonth.from(dateReturned).equals(YearMonth.from(dateDue))) {
                return (int) (15 * ChronoUnit.DAYS.between(dateDue, dateReturned));
            } else if (YearMonth.from(dateReturned).isAfter(YearMonth.from(dateDue))) {

                if (Year.from(dateReturned).equals(Year.from(dateDue))) {
                    return (int) (500 * ChronoUnit.MONTHS.between(dateDue, dateReturned));
                } else {
                    return 10000;
                }
            }
        }
        return 0;
    }

}
