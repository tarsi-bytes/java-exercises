/*
Complete the solution so that it reverses the string passed into it.
*/

package codewars.level8kyu;

public class ReversedString {
    public static String solution(String str){
        String reversedStr = "";

        for (int i = 0; i < str.length(); i++) {
            reversedStr = str.charAt(i) + reversedStr;
        }

        return reversedStr;
    }

    public static void main(String[] args) {
        System.out.println(ReversedString.solution("Hello")); // olleH
        System.out.println(ReversedString.solution("World")); // dlroW
    }
}

/*
    The method charAt(int index) belongs to the String class.
    It returns the character located at the specified index (0-based) of the string.
    Example: "Hello".charAt(1) returns 'e' because index 1 corresponds to 'e'.
*/