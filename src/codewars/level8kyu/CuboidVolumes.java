/*
In this simple exercise, you will create a program that will take two lists of integers, a and b. Each list will consist of 3 positive integers above 0, representing the dimensions of cuboids a and b. You must find the difference of the cuboids' volumes regardless of which is bigger.
---
For example, if the parameters passed are ([2, 2, 3], [5, 4, 1]), the volume of a is 12 and the volume of b is 20. Therefore, the function should return 8.
---
Your function will be tested with pre-made examples as well as random ones.
*/

package codewars.level8kyu;

public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int firstCuboidVolume = firstCuboid[0] * firstCuboid[1] * firstCuboid[2];
        int secondCuboidVolume = secondCuboid[0] * secondCuboid[1] * secondCuboid[2];

        return Math.abs(secondCuboidVolume - firstCuboidVolume);
    }

    public static void main(String[] args) {
        System.out.println(CuboidVolumes.findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4})); // 14
        System.out.println(CuboidVolumes.findDifference(new int[]{9, 7, 2}, new int[]{5, 2, 2})); // 106
    }
}
