package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoArrayList_01 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(15);
        lst.add(12);
        lst.add(69);
        lst.add(56);
        lst.add(60);
        
        System.out.println(lst);  //For checking the data
        
        Collections.sort(lst);  //For sorting the data
        
        int pos = Collections.binarySearch(lst, 56);    //For binary search of position of the data
        System.out.println("Position is: "+pos);
        
        List<Integer> lst1 = Arrays.asList(1,2,3,4,5);  //Easy way to create the list
        
        for(Integer i : lst1)        //For accessing the data
            System.out.println(i);
        
        boolean dis = Collections.disjoint(lst1, lst);
        System.out.println(dis);
        
        
    }
}
