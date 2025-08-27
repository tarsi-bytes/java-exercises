/*
Bob needs a fast way to calculate the volume of a rectangular
cuboid with three values: the length, width and height of the cuboid.
---
Write a function to help Bob with this calculation.
*/

package codewars.level8kyu;

public class CuboidVolume {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        System.out.println(CuboidVolume.getVolumeOfCuboid(1, 2, 2)); // 4
        System.out.println(CuboidVolume.getVolumeOfCuboid(6.3, 2, 5)); // 63
    }
}
