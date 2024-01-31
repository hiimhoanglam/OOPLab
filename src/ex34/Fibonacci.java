package ex34;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(5);
        tribonacci(5);
    }
    public static void fibonacci(int n) {
        int fn = 1;
        int f1 = 1;
        int f2 = 1;
        for (int i = 2; i < n; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        System.out.println("The " + n + "th fibonacci number is " + fn);
    }
    public static void tribonacci(int n) {
        int fn = 1;
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 3; i < n; i++) {
            fn = f1 + f2 + f3;
            f1 = f2;
            f2 = f3;
            f3 = fn;
        }
        System.out.println("The " + n + "th tribonacci number is " + fn);
    }
}
