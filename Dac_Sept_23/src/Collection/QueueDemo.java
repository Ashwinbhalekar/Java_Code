package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("Rahul");
        q.add("Chirayu");
        q.add("Saurabh");
        q.add("Ashwin");
        q.add("Bhupesh");
                      
        System.out.println(q);
//        String p = q.poll();
//        System.out.println(p);
//        String p1 = q.poll();
//        System.out.println(p1);
//        String p2 = q.poll();
//        System.out.println(p2);
//        String p3 = q.poll();
//        System.out.println(p3);
//        String p4 = q.poll();
//        System.out.println(p4);
        
        Iterator it = q.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
