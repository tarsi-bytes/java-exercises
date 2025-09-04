/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is
an isogram. Assume the empty string is an isogram. Ignore letter case.
*/

package codewars.level7kyu;

public class Isograms {
    public static boolean isIsogram(String str){
        str = str.toLowerCase(); // ignore letter case

        // Outer loop: go through each character in the string
        for (int i = 0; i < str.length(); i++){
            char character = str.charAt(i);

            // Inner loop: check all characters after the current character
            for (int j = i + 1; j < str.length(); j++){
                // If we find a duplicate character, the string is not an isogram
                if (character == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Isograms.isIsogram("moose"));      // false, 'o' repeats
        System.out.println(Isograms.isIsogram("isogram"));    // true, all letters unique
        System.out.println(Isograms.isIsogram(""));           // true, empty string is considered an isogram
        System.out.println(Isograms.isIsogram("Dermatoglyphics")); // true, no repeating letters
    }
}
