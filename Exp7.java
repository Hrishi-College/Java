/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP7 : Write a program to implement single and multilevel 
           inheritance using super keyword.
*/
// Base class
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
    }
}

// Single Inheritance: Child class extending Person
class Online extends Person {
    String course;

    Online(String name, String course) {
        super(name);  // Calling the constructor of Person class
        this.course = course;
    }

    void displayOnlineInfo() {
        System.out.println("Course: " + course);
    }
}

// Another single inheritance: Child class extending Person
class SavingAccount extends Person {
    double balance;

    SavingAccount(String name, double balance) {
        super(name);  // Calling the constructor of Person class
        this.balance = balance;
    }

    void displaySavingAccountInfo() {
        System.out.println("Balance: $" + balance);
    }
}

// Multilevel Inheritance: Child class extending SavingAccount
class AccountDetails extends SavingAccount {
    String accountNumber;

    AccountDetails(String name, double balance, String accountNumber) {
        super(name, balance);  // Calling the constructor of SavingAccount class
        this.accountNumber = accountNumber;
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
    }
}

// Main class
public class Exp7 {
    public static void main(String[] args) {
        // Creating object of Online class (Single Inheritance)
        Online onlineStudent = new Online("John", "Java Programming");
        onlineStudent.displayPersonInfo();
        onlineStudent.displayOnlineInfo();

        System.out.println();

        // Creating object of AccountDetails class (Multilevel Inheritance)
        AccountDetails account = new AccountDetails("Alice", 1500.75, "ACC12345");
        account.displayPersonInfo();
        account.displaySavingAccountInfo();
        account.displayAccountDetails();
    }
}
