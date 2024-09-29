/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP6 : Vector Operations and String Buffer Functions
*/
public class Exp6PostLab4 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Original String: " + sb);
        
        sb.replace(6, 11, "Java"); // Replaces "World" with "Java"
        System.out.println("After replacement: " + sb);
    }
}
