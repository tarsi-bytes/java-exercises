/*
You might know some pretty large perfect squares. But what about the NEXT one?
---
Complete the findNextSquare method that finds the next integral perfect square
after the one passed as a parameter. Recall that an integral perfect square is
an integer n such that sqrt(n) is also an integer.
---
If the argument is itself not a perfect square then return either -1 or an empty
value like None or null, depending on your language. You may assume the argument
is non-negative.
*/

package codewars.level7kyu;

public class NextPerfectSquare {
    public static long findNextSquare (long sq) {
        // Math.sqrt(sq) returns the square root of the number 'sq' as a double.
        // For example, Math.sqrt(9) = 3.0 and Math.sqrt(10) ≈ 3.162...
        // By casting it to long, we keep only the integer part
        long root = (long) Math.sqrt(sq);

        // If squaring the root gives back the original number, it means 'sq' is a perfect square
        if (root * root == sq) {
            // The next perfect square is just the next integer squared
            return (root + 1) * (root + 1);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(NextPerfectSquare.findNextSquare(121)); // 144
        System.out.println(NextPerfectSquare.findNextSquare(625)); // 676
        System.out.println(NextPerfectSquare.findNextSquare(114)); // -1
    }
}

/*
A perfect square is a number that results from an integer being multiplied by itself.
For example, 9 is a perfect square because it is 3 x 3. To determine if a number is a
perfect square, you can calculate its square root. If the square root is a whole number,
then the original number is a perfect square.

The method Math.sqrt() in Java is used to compute the square root of a number.
It always returns a double, even if the result is a whole number.
For example:
    Math.sqrt(16) -> 4.0
    Math.sqrt(20) -> 4.472135...
*/