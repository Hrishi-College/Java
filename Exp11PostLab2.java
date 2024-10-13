/*  
    NAME : HRISHI PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP11 : Implement Multithreading in Java
*/
class PrintAlphabets extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
            try {
                Thread.sleep(300); // Sleep for 300 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class PrintNumbers extends Thread {
    public void run() {
        for (int i = 1; i <= 26; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(300); // Sleep for 300 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Exp11PostLab2 {
    public static void main(String[] args) {
        PrintAlphabets alphabetThread = new PrintAlphabets();
        PrintNumbers numberThread = new PrintNumbers();

        alphabetThread.start();
        numberThread.start();
    }
}

