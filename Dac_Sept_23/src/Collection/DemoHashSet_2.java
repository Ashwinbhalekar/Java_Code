package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DemoHashSet_2 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(10,20,30,30,40,40,50);
        Set<Integer> st = new LinkedHashSet<>();   //For removing the duplicate values from list
        st.addAll(lst);
        //System.out.println(lst);
        //System.out.println(st);
        
        lst = new ArrayList<>();
        lst.addAll(st);
        //System.out.println(lst);
        
        for(Integer i:lst)
            System.out.println(i);
    }
}
