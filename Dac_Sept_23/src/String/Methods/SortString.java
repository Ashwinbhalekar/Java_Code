/*Sort the string atleast 10 words*/

package String.Methods;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
       String str1 = "Demonstrate Association by creating relationships between these classes.";
        String str2 = "My name is Ashwin";
      // String str3 = new String("What is your name?");
       // String str4 = "My name is Ashwin";
       
      String str3 = str1.concat(str2); //for combine two string we use concat
        System.out.println(str3);
        StringBuffer sb = new StringBuffer(str3); //reverse is a method of string buffer class that is why we have created a string bugffer object
        String str4 = (sb.reverse()).toString(); // converting string buffer into string
        System.out.println(str4);
        
       int x = str1.indexOf('a');
        System.out.println(x);
        int y = str2.charAt(4);
        System.out.println(y);
        
        
       System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        
        
        System.out.println(str1.equals(str2));
       System.out.println(str2.equals(str3));
        System.out.println(str1.equals(str3));
         System.out.println(str2.equals(str4));
         
         String s[] = str2.split(" ");
         System.out.println("Orignal order");
         for(String name :s){
             System.out.println(name);
         }
         System.out.println("***************************************************");   
         for(int i = 0; i < s.length - 1; i++){
             for(int j = i + 1; j < s.length; j++){
                 if(s[i].compareToIgnoreCase(s[j]) > 0){
                     String temp;
                     temp = s[i];
                     s[i] = s[j];
                     s[j] = temp;
                  }
             }
         }
         System.out.println("Sorted Order");
            for(String name :s){
             System.out.println(name);
            }
         
        //char a[] = str1.toCharArray();
       // Arrays.sort(a);
        //System.out.println(a);
        
    }
}
