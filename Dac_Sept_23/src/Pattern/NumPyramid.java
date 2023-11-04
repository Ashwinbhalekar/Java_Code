package Pattern;

import java.util.Scanner;

public class NumPyramid {
        void pyramid(){
     int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pattern:");
     r = sc.nextInt();
     for(int i=0;i<r;i++){
         for(int j=r-1;j>i;j--){
             System.out.print(" ");
         }
         for(int j=0;j<=i;j++){
             System.out.print( " "+i);
         }
         System.out.println("");
     }
     
    }
    public static void main(String[] args) {
        NumPyramid  n = new NumPyramid ();
        n.pyramid();
    }
}
