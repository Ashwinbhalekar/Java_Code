package Thread;
public class demoThread extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            if(this.getName().equals("Second")){
                try{
                    sleep(1000);
                }catch(Exception e){
                }
            }
            System.out.println(this.getName()+i);
        }
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());  //For cheacking Thread details
        demoThread t1 = new demoThread();
        demoThread t2 = new demoThread();                    //Threat at Newly Born Stage
        
        t1.setName("First");
        t2.setName("Second");                           //Giving the name to thread
        
        t1.start();
        t2.start();                                         //Tread at ready to run stage
        
        try{
            t1.join();
        }catch(Exception e){                               //For exit the main thread after "First"
        }
        
        System.err.println("Main Thread Exited");
    }
}
