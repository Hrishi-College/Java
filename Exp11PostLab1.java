/*  
    NAME : HRISHI PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP11 : Implement Multithreading in Java
*/
class PrintStars extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("/*/");
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Exp11PostLab1 {
    public static void main(String[] args) {
        PrintStars thread1 = new PrintStars();
        PrintStars thread2 = new PrintStars();

        thread1.start();
        thread2.start();
    }
}
