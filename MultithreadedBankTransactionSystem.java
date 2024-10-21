// BankAccount class to represent the account
class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method to deposit money
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", Current balance: " + balance);
        notifyAll(); // Notify other threads that a deposit has occurred
    }

    // Synchronized method to withdraw money
    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            System.out.println(Thread.currentThread().getName() + " is waiting to withdraw " + amount + " (Insufficient funds, Current balance: " + balance + ")");
            try {
                wait(); // Wait until there is enough balance to withdraw
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", Current balance: " + balance);
    }

    // Method to return current balance
    public int getBalance() {
        return balance;
    }
}

// Runnable class to simulate deposit transactions
class DepositTask implements Runnable {
    private BankAccount account;
    private int amount;

    public DepositTask(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            account.deposit(amount);
            try {
                Thread.sleep(100); // Simulate some delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Runnable class to simulate withdraw transactions
class WithdrawTask implements Runnable {
    private BankAccount account;
    private int amount;

    public WithdrawTask(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            account.withdraw(amount);
            try {
                Thread.sleep(150); // Simulate some delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Main class to simulate the multithreaded bank transaction system
public class MultithreadedBankTransactionSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Starting balance

        // Create deposit and withdraw tasks
        Thread depositThread1 = new Thread(new DepositTask(account, 300), "DepositThread1");
        Thread depositThread2 = new Thread(new DepositTask(account, 400), "DepositThread2");
        Thread withdrawThread1 = new Thread(new WithdrawTask(account, 500), "WithdrawThread1");
        Thread withdrawThread2 = new Thread(new WithdrawTask(account, 600), "WithdrawThread2");

        // Start the threads
        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();

        // Wait for all threads to finish
        try {
            depositThread1.join();
            depositThread2.join();
            withdrawThread1.join();
            withdrawThread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final account balance: " + account.getBalance());
    }
}

