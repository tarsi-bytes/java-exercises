/*
Write a function that takes an array of words and smashes them together into a
sentence and returns the sentence. You can ignore any need to sanitize words or
add punctuation, but you should add spaces between each word. Be careful, there
shouldn't be a space at the beginning or the end of the sentence!
---
Assumptions
    > You can assume that you are only given words.
    > You cannot assume the size of the array.
    > You can assume that you do get an array.
*/

package codewars.level8kyu;

public class SmashWords {
    public static String smash(String... words) {
        String fullSentence = String.join(" ", words);
        return fullSentence;
    }

    public static void main(String[] args) {
        System.out.println(SmashWords.smash(new String[] {"hello", "world"})); // "hello world"
        System.out.println(SmashWords.smash(new String[] {"how", "are", "you?"})); // "how are you?"
    }
}