/*1.Write a generic method to count the number of elements in a collection that have a
specific property (for example, odd integers, prime numbers, palindromes).*/
package generic.labTask;

import java.util.List;

public class genericMethod_Q1 {

    public static void showOdd(List<? extends Number> lst) {
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("**********************************");
        System.out.println("**********************************");
    }

    public static void showPrime(List<? extends Number> lst) {
        for (int i = 3; i <= 100; i++) {

            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    System.out.println(i);
                }
                if (i % j == 0) {
                    break;
                }

            }
        }
        System.out.println("**********************************");
        System.out.println("**********************************");
    }

    public static boolean showPalindrome(List<? extends Number> lst) {
        int num = 0;
        int palindrome = num;
        int reverse = 0;

        while (palindrome != 0) {
            int rem = palindrome % 10;
            reverse = reverse * 10 + rem;
            palindrome = palindrome / 10;
        }
        return num == reverse;
        
    }

    public static void main(String[] args) {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        showOdd(lst);
        showPrime(lst);
        showPalindrome(lst);
    }
}
