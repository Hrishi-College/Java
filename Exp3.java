/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP3 : Write a program to create a class Account to perform the 
            operation of insert, deposit and withdrawal of single 
            employee and make use of object.
*/
import java.util.Scanner;

class Account {
    int accountNumber;
    String accountHolderName;
    double balance;

    void insert(int accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Exp3 {
    public static void main(String[] args) {
        Account acc = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number:");
        int accNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder name:");
        String name = sc.nextLine();
        System.out.println("Enter initial balance:");
        double balance = sc.nextDouble();

        acc.insert(accNo, name, balance);
        acc.display();

        System.out.println("Enter amount to deposit:");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);
        acc.checkBalance();

        System.out.println("Enter amount to withdraw:");
        double withdrawAmount = sc.nextDouble();
        acc.withdraw(withdrawAmount);
        acc.checkBalance();
    }
}
