/*Q1. Write a Java program to take a string as an input and reverse it using Stack.*/
package ADS.ADS_Day_01;

import java.util.Collections;
import java.util.Stack;

class Mystring{
   Stack s = new Stack();
   public void push(String name){
       s.push(name);
   }
   public void rev(){
       Collections.reverse(s);
       System.out.println("Revers: "+s);
   }
}
public class LabTask_1 {
    public static void main(String[] args) {
        Mystring st = new Mystring();
        st.push("U");
        st.push("H");
        st.push("S");
        st.push("A");
        st.rev();
    }
}
