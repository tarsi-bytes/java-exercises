/*
Sum all the numbers of a given array ( cq. list ), except the highest and the
lowest element ( by value, not by index! ).
---
The highest or lowest element respectively is a single element at each edge,
even if there are more than one with the same value.
---
If an empty value ( null, None, Nothing, nil etc. ) is given instead of an array,
or the given array is an empty list or a list with only 1 element, return 0.
*/

package codewars.level8kyu;

public class SumNumbers {
    public static int sum(int[] numbers) {
        // Handle edge cases: null, empty array, or single-element array
        if (numbers == null || numbers.length <= 1) {
            return 0;
        }

        // Find min and max values
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Sum all elements except min and max
        int totalSum = 0;
        boolean minSkipped = false;
        boolean maxSkipped = false;

        for (int num : numbers) {
            if (num == min && !minSkipped) {
                minSkipped = true; // skip only the first occurrence of min
            } else if (num == max && !maxSkipped) {
                maxSkipped = true; // skip only the first occurrence of max
            } else {
                totalSum += num;
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println(SumNumbers.sum(new int[] { 6, 2, 1, 8, 10}));
    }
}
