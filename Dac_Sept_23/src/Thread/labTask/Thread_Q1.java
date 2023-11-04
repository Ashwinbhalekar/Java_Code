/*1.Write a Java program that creates two threads to find and print even and odd numbers from 1
to 20.*/
package Thread.labTask;

class even implements Runnable {

    String name;

    public even(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(this.name + i);
            }
        }
    }

}

class odd implements Runnable {

    String name;

    public odd(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(this.name + i);
            }
        }
    }

}

public class Thread_Q1 {

    public static void main(String[] args) {

        System.out.println("Even Numbers...");
        even t1 = new even("Even");

        Thread th1 = new Thread(t1);

        th1.start();

        System.out.println("Odd Numbers...");

        odd o1 = new odd("Odd");

        Thread Th1 = new Thread(o1);

        Th1.setName("Odd");

        Th1.start();

    }
}
