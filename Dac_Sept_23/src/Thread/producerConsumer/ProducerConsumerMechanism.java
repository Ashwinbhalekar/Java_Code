package Thread.producerConsumer;

import java.util.Vector;

class Production implements Runnable{
    private final Vector buffer;
    private final int SIZE;

    public Production(Vector buffer, int SIZE) {
        this.buffer = buffer;
        this.SIZE = SIZE;
    }
    public void produce(int i) throws InterruptedException{
        if(buffer.size()==SIZE){
            synchronized (buffer) {
            System.out.println("The buffer is Full & waiting to consume items. "+buffer.size());
            buffer.wait();   //Blocked production
           }
        }
        synchronized (buffer){
        buffer.add(i);
        buffer.notifyAll();  //Unblock Consumption
        }
    }
    
    @Override
    public void run() {
        for(int i=1;i<10;i++){
            try{
            produce(i);
            System.out.println("Produced item "+i);
            }catch(Exception e){
            }
        }
    }
}
class Consumption implements Runnable{
    private final Vector buffer;
    private final int SIZE;

    public Consumption(Vector buffer, int SIZE) {
        this.buffer = buffer;
        this.SIZE = SIZE;
    }
    
    public int consume() throws InterruptedException{
        if(buffer.size()==0){
            synchronized (buffer) {
            System.out.println("Buffer is empty & waiting to produce item. "+buffer.size());
            buffer.wait();  //Blocked consumption
            }
        }
        synchronized (buffer) {
        buffer.notifyAll();    //Unblock production
        return (Integer)buffer.remove(0);
        }
    }
    @Override
    public void run() {
        while(true){
            try{
            System.out.println("Comsumed items "+consume());
            Thread.sleep(1000);
            }catch(Exception e){
            }
        }
    }
}
public class ProducerConsumerMechanism {
    public static void main(String[] args) {
        Vector buff = new Vector();
        int size = 5;
        Production pro = new Production(buff,size);
        Consumption con = new Consumption(buff,size);
        
        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(con);
        
        t1.start();
        t2.start();
    }
}
