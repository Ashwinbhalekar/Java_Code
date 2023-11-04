package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoHashSet {
    public static void main(String[] args) {
        //Set<Integer> st = new LinkedHashSet<>();    //LinkedHashSet use for maintaining the squence
        //Set<Integer> st = new HashSet<>();    //HashSet does not maintaining the squence
        Set<Integer> st = new TreeSet<>();    //TreeSet use for maintaining the order
        st.add(10);
        st.add(80);
        st.add(30);
        st.add(90);
        st.add(20);
        System.out.println(st);
        
        for(Integer i:st)
            System.out.println(i);
    }
}
