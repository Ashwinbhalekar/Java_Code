package overloading;

import java.util.Scanner;

public class RouteFinder {
     void route(String src,String via,String dest)
     {
         System.out.println("Moving from "+src+" to "+dest+" via "+via);
     }
     void route(String src,String dest)
     {
         System.out.println("moving from "+src+" To "+dest);
     }
      void route(String dest)
      {
          System.out.println("Moving to "+dest);
      }
     
     public static void main(String[] args) 
     {
       RouteFinder rf=new RouteFinder();
         System.out.println("plese enter");
         System.out.println("1. for destination only");
         System.out.println("2. for source and destination");
         System.out.println("3. for source, via and destination");
         
         Scanner sc=new Scanner(System.in);
         Scanner sc1=new Scanner(System.in);
          
         int choice=sc1.nextInt();
         switch (choice) {
             case 1:{
                 System.out.println("Enter Destination");
                 String d=sc.nextLine();
                 rf.route(d);         
                 break;
                 }
             case 2:{
                 System.out.println("Enter Source and Destination");
                 String s=sc.nextLine();
                 String d=sc.nextLine();
                 rf.route(s,d);         
                 break;
                 }
             case 3:{
                 System.out.println("Enter Source,via and Destination");
                 String s=sc.nextLine();
                 String v=sc.nextLine();
                 String d=sc.nextLine();
                 rf.route(s,v,d);         
                 break;
                 }
             default:
                 System.out.println("This Facility is not available");
         }
     }
}