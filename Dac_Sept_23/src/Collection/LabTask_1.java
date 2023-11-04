/*Q1. Write a Java program to create a new array list, add some colors
(string) and print out the collection.*/
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

public class LabTask_1 {
    public static void main(String[] args) {
        ArrayList c = new ArrayList<>();
        c.add("Pink");
        c.add("Red");
        c.add("Yellow");
        c.add("Purple");
        c.add("Green");
        
        System.out.println(c);
        
        /*Q2.Write a Java program to iterate through all elements in an array list.*/
//        Iterator it = c.iterator();
//        while(it.hasNext())
//            System.out.println(it.next());
        
        /*Q3.Write a Java program to insert an element into the array list at the first position.*/
        c.add(0, "Black");
        System.out.println(c);
        
        /*Q4.Write a Java program to retrieve an element (at a specified index) from a given array list.*/
        System.out.println(c.get(4));
        
        /*Q5.Write a Java program to sort a given array list*/
//        Collections.sort(c);
//        System.out.println("Sorted array: "+c);
        
        /*Q6. Create a list of java defined wrapper classes and perform insert/delete/search/iterate/sort operations..*/
        c.add(12);
        c.add(12.06);
        c.add(new Date());
        System.out.println(c);
        c.add(12.0696);
        System.out.println(c);
        c.remove(9);
        System.out.println(c);
        System.out.println(c.get(7));
        Iterator it = c.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        Collections.sort(c);
        System.out.println("Sorted array: "+c);
    }
    
}



