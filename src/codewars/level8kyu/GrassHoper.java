package codewars.level8kyu;

public class GrassHoper {
    public static char getGrade(int s1, int s2, int s3) {
        int average = (s1 + s2 + s3) / 3;
        if (average >= 90) {
            return 'A';
        } else if (average >= 80 && average < 90) {
            return 'B';
        } else if (average >= 70 && average < 80) {
            return 'C';
        } else if (average >= 60 && average < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        System.out.println(GrassHoper.getGrade(95,90,93)); // A
        System.out.println(GrassHoper.getGrade(70, 70, 100)); // B
        System.out.println(GrassHoper.getGrade(60,82,76)); // C
        System.out.println(GrassHoper.getGrade(58,62,70)); // D
        System.out.println(GrassHoper.getGrade(48,55,41)); // F
    }
}
