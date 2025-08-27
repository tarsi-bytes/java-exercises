/*
The first century spans from the year 1 up to and
including the year 100, the second century - from the year
101 up to and including the year 200, etc.
---
The first century spans from the year 1 up to and including
the year 100, the second century - from the year 101 up to
and including the year 200, etc.
*/

package codewars.level8kyu;

public class CenturyFromYear {
    public static int century(int number) {
        if (number % 100 == 0) {
            return number / 100;
        } else {
            return (number / 100) + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(CenturyFromYear.century(1705)); // 18
        System.out.println(CenturyFromYear.century(1900)); // 19
        System.out.println(CenturyFromYear.century(2000)); // 20
    }
}