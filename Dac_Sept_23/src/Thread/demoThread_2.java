package Thread;

public class demoThread_2 implements Runnable {
   String name;

    public demoThread_2(String name) {
        this.name = name;
    }
   
    @Override
    public void run() {
        for(int i=0;i<9;i++)
            System.out.println(this.name +i);
    }
    public static void main(String[] args) {
        demoThread_2 dt1 = new demoThread_2("One");
        demoThread_2 dt2 = new demoThread_2("Two");
        
        Thread th1 = new Thread(dt1);
        Thread th2 = new Thread(dt2);
        
        th1.start();
        th2.start();
    }
}
