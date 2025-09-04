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
