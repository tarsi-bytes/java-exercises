package codewars.level8kyu;

import java.util.Arrays;

public class PipeFix {
    public static int[] pipeFix(int[] numbers) {
        int firstElement = numbers[0];  // the first number in the array
        int lastElement = numbers[numbers.length - 1];  // the last number in the array
        int[] numbersFixed = new int[lastElement - firstElement + 1];
        // numbersFixed = a new array that will contain ALL numbers from firstElement up to lastElement.
        // Its size is (last - first + 1), so if first=1 and last=9 → size = 9 elements (9 - 1 = 8 + 1 = 9)

        // Fill the array with consecutive numbers starting from firstElement
        for (int i = 0; i < numbersFixed.length; i++) {
            numbersFixed[i] = firstElement + i;
            // if the first number = 1 and the last number = 3:
            // numbersFixed[0] = 1 + 0 -> [0] = 1;
            // numbersFixed[1] = 1 + 1 -> [1] = 2;
            // numbersFixed[2] = 1 + 2 -> [2] = 3;
        }

        return numbersFixed;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(PipeFix.pipeFix(new int[]{1,3})));
        System.out.println(Arrays.toString(PipeFix.pipeFix(new int[]{1,3,5,9})));
        System.out.println(Arrays.toString(PipeFix.pipeFix(new int[]{0,3,8,17})));
    }
}
