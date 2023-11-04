package Collection.Map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentDemo {
    public static void main(String[] args) {
        //HashMap<Integer,String> mp = new HashMap<>();
        ConcurrentHashMap<Integer,String> mp = new ConcurrentHashMap<>();
        mp.put(101, "Ashwin");
        mp.put(102, "Saorabh");
        mp.put(103, "Mihir");
        
        Runnable task=() -> {
            for(int i=104;i<=106;i++){
                mp.put(i,"value"+i);
            }
        };
      Thread th1 = new Thread(task);          
      Thread th2 = new Thread(task);          
      Thread th3 = new Thread(task);   
      
      th1.start();
      th2.start();
      th3.start();
      
       try{
       th1.join();
       th2.join();
       th3.join();
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
        System.out.println(mp);
    }
}
