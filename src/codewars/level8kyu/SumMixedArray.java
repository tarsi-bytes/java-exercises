package codewars.level8kyu;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SumMixedArray {
    public static int sum(List<?> mixed) {
        int sum = 0;

        for (Object item : mixed) {
            // If the element is an Integer, cast it and add to sum
            if (item instanceof Integer) {
                sum += (int) item;
            // If the element is a String, parse it into an integer and add to sum
            } else if (item instanceof String) {
                // Integer.parseInt() only accepts a String, not a generic Object. So we must cast it to String before parsing
                sum += Integer.parseInt((String) item);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SumMixedArray.sum(Arrays.asList(9, 3, "7", "3"))); // 22
        System.out.println(SumMixedArray.sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7))); // 42
    }
}
