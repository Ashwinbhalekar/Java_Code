/*4.Write a Java program that calculates the sum of all prime numbers up to a given limit using
multiple threads*/
package Thread.labTask;
public class Thread_Q4 implements Runnable {

    @Override
    public void run() {
        int sum=0;
        int count=0;
     
        for(int i=3;i<=100;i++){ 
            
            for(int j=2;j<=i;j++)
            {
                if(j==i){
                    System.out.println(i);
                   sum=sum+i;
                }
               if(i%j==0)
               {
                  break;
               }
               
               
            }

        }
        System.out.println("*********************");
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        //System.out.println(Thread.currentThread());
        Thread_Q4 tq = new Thread_Q4();
        
        Thread th[] = new Thread[100];
        for(int i=0;i<th.length;i++){
            th[i]=new Thread(tq);
            th[i].start();
        }
    }
    
}
