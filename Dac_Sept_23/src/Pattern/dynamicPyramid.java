package Pattern;

import java.util.Scanner;

public class dynamicPyramid {

    void pyramid() {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pattern:");
        r = sc.nextInt();
        char c = 'A';
        for (int i = 0; i < r; i++) {
            for (int j = r - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + c);
            }
            c++;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        dynamicPyramid d = new dynamicPyramid();
        d.pyramid();
    }
}
