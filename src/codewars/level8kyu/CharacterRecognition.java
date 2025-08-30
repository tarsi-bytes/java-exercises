/*
Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched and stored on a computer.
When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.
Your task is correct the errors in the digitised text. You only have to handle the following mistakes:

S is misinterpreted as 5
O is misinterpreted as 0
I is misinterpreted as 1

The test cases contain numbers only by mistake.
*/

package codewars.level8kyu;

public class CharacterRecognition {
    public static String correct(String string) {
        /*
        String character = "";

        for (int i = 0; i < string.length(); i++) {
            character = String.valueOf(string.charAt(i));
            if (character.equals("0")) {
                string = string.replace("0", "O");
            }
            if (character.equals("5")) {
                string = string.replace("5", "S");
            }
            if (character.equals("1")) {
                string = string.replace("1", "I");
            }
        }
        return string;
        */
        return string.replace("5", "S").replace("0", "O").replace("1", "I");
    }

    public static void main(String[] args) {
        System.out.println(CharacterRecognition.correct("J. R. R. T0LK1EN - THE L0RD 0F THE R1NG5"));
        System.out.println(CharacterRecognition.correct("ERNE5T HEM1NGWAY - F0R WH0M THE BELL T0LL5"));
    }
}
