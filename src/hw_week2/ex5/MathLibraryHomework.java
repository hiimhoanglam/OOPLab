package hw_week2.ex5;

import java.math.BigInteger;
import java.util.Scanner;

public class MathLibraryHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        testSpecialSeries(sc);
//        testTrigonometric(sc);
//        testNumberConversion(sc);
//        factorialInt();
        fibonacciInt();
    }
    public static double sin(double x, int numTerms) {
        double result = 0;
        double temp = x;
        int term = 2;
        for (int count = 1; count < numTerms; count++) {
            result += temp;
            temp *= ((-1) * x * x) / (term * (term + 1));
            term += 2;
        }
        return result;
    }
    public static double cos(double x, int numTerms) {
        double result = 0;
        double temp = 1;
        int term = 1;
        for (int count = 1; count < numTerms; count++) {
            result += temp;
            temp *= ((-1) * x * x) / (term * (term + 1));
            term += 2;
        }
        return result;
    }
    public static void testTrigonometric(Scanner sc) {
        System.out.println("Enter the value for x: ");
        double x = sc.nextDouble();
        System.out.println("Enter the number of terms: ");
        int numTerms = sc.nextInt();
        System.out.println("Math.cos with x = " + x + " = " + Math.cos(x));
        System.out.println("Math.sin with x = " + x + " = " + Math.sin(x));
        System.out.println("Our sin function with x = " + x + " and " + numTerms +
        numTerms + " = " + sin(x,numTerms));
        System.out.println("Our cos function with x = " + x + " and " + numTerms +
        numTerms + " = " + cos(x,numTerms));
    }
    public static double specialSeries(double x, int numTerms) {
        double result = x;
        double temp = x;
        double upperExponent = 1;
        double lowerExponent = 2;
        int term = 3;
        for (int count = 1; count < numTerms; count++) {
            temp *= (x * x);
            result += (temp / term) * (upperExponent / lowerExponent);
            upperExponent += 2;
            lowerExponent += 2;
            term += 2;
    }
        return result;
    }
    public static void factorialInt() {
        int i = 1;
        while (Integer.MAX_VALUE / getFactorial(i - 1) >= (i + 1)) {
            System.out.printf("The factorial of %d is %d\n", i, getFactorial(i));
            i++;
        }
        System.out.printf("The factorial of %d is out of range",i);
    }
    public static int getFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
    public static void fibonacciInt() {
        int i = 0;
        while (Integer.MAX_VALUE - getFibonacci(i-1) >= getFibonacci(i-2)) {
            System.out.printf("F(%d) = %d\n",i, getFibonacci(i));
            i++;
        }
        System.out.printf("F(%d) is out of range",i);

    }
    public static int getFibonacci(int n) {
        if (n <= 1) {
            return 1;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
    public static void testSpecialSeries(Scanner sc) {
        System.out.println("Enter the value for x: ");
        double x = sc.nextDouble();
        System.out.println("Enter the number of terms: ");
        int numTerms = sc.nextInt();
        System.out.println("Value for special series with x = " + String.format("%.2f", x) + " and " + numTerms +
                " number of terms is " + specialSeries(x, numTerms));

    }
    public static String toRadix(String in, int inRadix, int outRadix) {
        BigInteger number = new BigInteger(in, inRadix);
        return number.toString(outRadix);
    }
    public static void testNumberConversion(Scanner sc) {
        System.out.println("Enter a number and radix: ");
        String input = sc.next();
        System.out.println("Enter the input radix: ");
        int inRadix = sc.nextInt();
        System.out.println("Enter the output radix: ");
        int outRadix = sc.nextInt();
        System.out.printf("%s in radix %d is \"%s\" in radix %d",
                input, inRadix, toRadix(input,inRadix,outRadix), outRadix);
    }
}
