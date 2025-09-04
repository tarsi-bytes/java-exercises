/*
Now you have to write a function that takes an argument and returns the square of it.
*/

package codewars.level8kyu;

public class SquareNumber {
    public static int square(int n){
        return (int) Math.pow(n, 2);
        //return n * n;
    }

    public static void main(String[] args) {
        System.out.println(SquareNumber.square(50)); // 2500
        System.out.println(SquareNumber.square(4)); // 16
    }
}
