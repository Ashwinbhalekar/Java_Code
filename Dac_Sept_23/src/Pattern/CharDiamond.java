
package Pattern;

import java.util.Scanner;

public class CharDiamond {
  char c='A';
   
    void pyramid() {
         
    int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pattern:");
        r = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = r-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" "+c);
            }
            c++;
            System.out.println("");
        }
        c='Y';
          for (int i = 0; i < r-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = r-1; j > i; j--) {
                System.out.print(" "+c);
            }
            c--;
            System.out.println("");
        }
    }
    

    /*void revPyramid() {
         int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pattern:");
        r = sc.nextInt();
        for (int i = 0; i < r-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = r-1; j > i; j--) {
                System.out.print(" "+c);
            }
            c--;
            System.out.println("");
        }
    }*/

    public static void main(String[] args) {
        CharDiamond d = new CharDiamond();
        d.pyramid();
        //d.revPyramid();
    }
}

