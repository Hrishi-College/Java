/*  
    NAME : HRISHI PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP11 : Implement Multithreading in Java
*/
class MyThread1 extends Thread {
    public void run() {
        create();
    }

    public void create() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Exp11 {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
        thread.start();
    }
}
