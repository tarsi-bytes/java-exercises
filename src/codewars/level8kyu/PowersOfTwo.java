/*
Complete the function that takes a non-negative integer n as input,
and returns a list of all the powers of 2 with the exponent ranging
from 0 to n ( inclusive ).
*/

package codewars.level8kyu;

import java.util.Arrays;

public class PowersOfTwo {
    public static long[] powersOfTwo(int n) {
        long[] result = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            result[i] = (long) Math.pow(2, i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(PowersOfTwo.powersOfTwo(0))); // [1]
        System.out.println(Arrays.toString(PowersOfTwo.powersOfTwo(4))); // [1, 2, 4, 8, 16]
        System.out.println(Arrays.toString(PowersOfTwo.powersOfTwo(6))); // [1, 2, 4, 8, 16, 32, 64]
    }
}
