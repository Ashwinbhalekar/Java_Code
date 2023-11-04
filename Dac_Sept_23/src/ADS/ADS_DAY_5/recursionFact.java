package ADS.ADS_DAY_5;
public class recursionFact {

    public static int fact(int n) {
        if (n == 0) {
            return 1; // Base case: 0! is 1
        } else {
            return n * fact(n - 1); // Recursive call to calculate factorial
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = fact(n);
        System.out.println("Factorial of " + n + " is: " + ans);
    }
}


