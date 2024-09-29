/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP6 : Vector Operations and String Buffer Functions
*/
public class Exp6PostLab3 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Original String: " + sb);
        
        sb.delete(5, 11); // Deletes " World"
        System.out.println("After deletion: " + sb);
    }
}

