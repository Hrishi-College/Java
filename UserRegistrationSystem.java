import java.util.Scanner;

// Custom exception for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom exception for invalid email format
class InvalidEmailFormatException extends Exception {
    public InvalidEmailFormatException(String message) {
        super(message);
    }
}

// Custom exception for invalid password length
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class UserRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        try {
            registerUser(name, age, email, password);
            System.out.println("Registration successful!");
        } catch (InvalidAgeException | InvalidEmailFormatException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void registerUser(String name, int age, String email, String password)
            throws InvalidAgeException, InvalidEmailFormatException, InvalidPasswordException {

        if (age < 18) {
            throw new InvalidAgeException("Error: Age must be at least 18 to register.");
        }

        if (!email.contains("@")) {
            throw new InvalidEmailFormatException("Error: Invalid email format. Email must contain '@'.");
        }

        if (password.length() < 6) {
            throw new InvalidPasswordException("Error: Password must be at least 6 characters long.");
        }
    }
}

