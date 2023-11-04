package Collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DemoArryList {
    public static void main(String[] args) {
        List lst = new ArrayList();
//        lst.add('D');
//        lst.add('A');
//        lst.add('B');
//        lst.add('D');
//        lst.add(3, 'C');
//        lst.remove(0);
//        System.out.println(lst);
//        System.out.println(lst.get(3));
//        System.out.println(lst.contains('C'));

          
          lst.add(23);
          lst.add(21.23);
          lst.add("Ashwinkumar bhalekar");
          lst.add(new Date());
          for(Object o : lst){
              System.out.println(o);
          }
          Iterator it = lst.iterator();
          while(it.hasNext())
              System.out.println(it.next());
    }
    
}
