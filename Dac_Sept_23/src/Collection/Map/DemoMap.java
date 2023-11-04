package Collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
    public static void main(String[] args) {
        //Map<Integer,String> mp = new LinkedHashMap<>();
         Map<Integer,String> mp = new HashMap<>();    //Does not gives guarentee for following the sequence 
        //Map<Integer,String> mp = new TreeMap<>();   
        mp.put(101, "Ashwin");
        mp.put(106 ,"Saorabh");
        mp.put(105, "Mihir");
        mp.put(109, "Manish");
        mp.put(103, "Nikhil");
        
        //System.out.println(mp);
        
        for(Integer i:mp.keySet()){                     //Accessing the data using keySet in for each loop
            String val = mp.get(i);
            System.out.println("Key: "+i+" Value: "+val);
        }
        for(String s:mp.values()){                      //Accessing the data using valuesSet
            System.out.println(s);
        }
    }
}
