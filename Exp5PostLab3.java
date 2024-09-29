/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP5 : Matrix Addition and Count Frequency of a Letter in String
*/
public class Exp5PostLab3 {

    public static void main(String[] args) {
        String input = "Programming is fun!";
        int vowelCount = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }
}

