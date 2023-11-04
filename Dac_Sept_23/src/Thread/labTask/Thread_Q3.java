/*3.Write a java program to call run method directly from the Main method.*/
package Thread.labTask;

import java.util.ArrayList;
import java.util.Collections;

public class Thread_Q3 implements Runnable {
    String name;

    public Thread_Q3(String name) {
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
        System.out.println(this.name + lst);
    }

    public static void main(String[] args) {
        Thread_Q3 tq = new Thread_Q3("Direct Call");
        tq.run();
    }
}
