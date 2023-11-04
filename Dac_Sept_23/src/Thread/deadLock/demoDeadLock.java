package Thread.deadLock;

import static java.lang.Thread.sleep;

public class demoDeadLock {
    public static void main(String[] args) {
        String rec1 = "Ashwin";
        String rec2 = "Shubham";
        
        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (rec1) {
                    System.out.println("Thread 1 uses resource1 "+rec1);
                    try{
                    sleep(100);
                    }catch(Exception e){
                    }
                }
                synchronized (rec1) {
                    System.out.println("Thread 2 uses resource 2 "+rec1);
                }
            }
            
        };
                Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (rec2) {
                    System.out.println("Thread 2 uses resource1 "+rec2);
                    try{
                    sleep(100);
                    }catch(Exception e){
                    }
                }
                synchronized (rec1) {
                    System.out.println("Thread 2 uses resource 2 "+rec2);
                }
            }
            
        };
        t1.start();
        t2.start();
    }
}
