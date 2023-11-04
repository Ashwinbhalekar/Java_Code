/*9.Write a java program to display your initials on the screen in block letters as shown. For
example the name Ashwin Bhalekar.
            A                          B B B B B B
          A   A                        B         B
        A       A                      B         B 
      A  A  A  A  A                    B B B B B       
    A               A                  B         B
  A                   A                B         B
A                       A              B B B B B B
*/
package Assignment;
public class Assign9 {
    public static void main(String[] args) {
        int rows = 7;
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                if (i == 1 || i == 4 || k == 1 || k == i) {
                    System.out.print("A ");
                } else {
                    System.out.print("  ");
                }
            }
            for(int k=0;k<10;k++)
            {
              System.out.print(" ");
            }
            for (int l = 1; l <= 3; l++) {
                if (i == 1 || i == 4 || i == 7 || l == 1 || l == 3) {
                    System.out.print("B ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int m = 1; m < i; m++) {
                if (i == 1 || i == 4) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
