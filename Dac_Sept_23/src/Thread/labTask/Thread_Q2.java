/*2.Write a Java program that sorts an array of integers using multiple threads.*/
package Thread.labTask;

import java.util.ArrayList;
import java.util.Collections;

public class Thread_Q2 implements Runnable {
    String name;

    public Thread_Q2(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(30);
        lst.add(20);
        lst.add(50);
        lst.add(90);
        lst.add(10);
        
        Collections.sort(lst);
        System.out.println(this.name +lst);
    }
    
    public static void main(String[] args) {
        Thread_Q2 tq1 = new Thread_Q2("Array1");
        Thread_Q2 tq2 = new Thread_Q2("Array2");
        Thread_Q2 tq3 = new Thread_Q2("Array3");
        
       Thread th1 = new Thread(tq1);
       Thread th2 = new Thread(tq2);
       Thread th3 = new Thread(tq3);
       
       th1.start();
       th2.start();
       th3.start();
    }
}
