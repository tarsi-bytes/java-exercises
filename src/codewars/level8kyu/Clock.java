/*
Clock shows h hours, m minutes and s seconds after midnight.
---
Your task is to write a function which returns the time since
midnight in milliseconds.
*/

package codewars.level8kyu;

public class Clock {
    public static int Past(int h, int m, int s) {
       int convertHours = h * (60 * 60 * 1000);
       int convertMinutes = m * (60 * 1000);
       int convertSeconds = s * 1000;

       int totalMilliseconds = convertHours + convertMinutes + convertSeconds;

       return (totalMilliseconds);
    }

    public static void main(String[] args){
        System.out.println(Clock.Past(0, 1, 1)); // 61.000
        System.out.println(Clock.Past(2,10,0)); // 7.800.000
    }
}
