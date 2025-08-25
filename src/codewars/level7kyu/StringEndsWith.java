/*
Complete the solution so that it returns true if the first argument(string)
passed in ends with the 2nd argument (also a string).
*/

package codewars.level7kyu;

public class StringEndsWith {
    public static boolean solution(String str, String ending) {
        if (str.length() < ending.length()) {
            return false;
        } else {
            String difference = str.substring(str.length() - ending.length());
            return difference.equals(ending);
        }
    }

    public static void main(String[] args) {
        System.out.println(StringEndsWith.solution("abc", "abc")); // true
        System.out.println(StringEndsWith.solution("sensei", "i")); // true
        System.out.println(StringEndsWith.solution("!@#$%^&*()", ":-)")); // false
    }
}

/*
Explanation:

1. substring(startIndex):
   - The method str.substring(n) returns a new string containing all characters
     from index n to the end of str.
   - In this solution, we use str.substring(str.length() - ending.length())
     to extract the last part of str that has the same length as ending.
   - This allows us to compare only the relevant portion of str to see if it matches ending.

2. equals():
   - In Java, the '==' operator checks whether two references point to the same object in memory.
     It does NOT compare the actual contents of strings.
   - The equals() method compares the contents (characters) of the strings.
   - Using difference.equals(ending) ensures we are checking whether the text is exactly the same.
*/