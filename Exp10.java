/*  
    NAME : HRISHI PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP10 : Implement User Defined Exception in Java
*/
import java.util.Scanner;

class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}

public class Exp10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month = scanner.nextInt();

        try {
            if (month < 1 || month > 12) {
                throw new InvalidMonthException("Invalid month number: " + month);
            }
            System.out.println("Month is valid.");
        } catch (InvalidMonthException e) {
            System.out.println(e.getMessage());
        }
    }
}
