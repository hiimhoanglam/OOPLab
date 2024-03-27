package week3;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(10));
        System.out.println(runningNumberSequence(12));
        System.out.println(gcd(30,12));
        System.out.println(gcd(12,30));
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        int f1 = 0;
        int f2 = 1;
        int fn = 1;
        for (int i = 2; i <= n; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
    public static String runningNumberSequence(int n) {
        if (n == 1) {
            return "1";
        }
        return runningNumberSequence(n-1) + n;
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, Math.abs(a % b));
    }
}
