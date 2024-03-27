package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberTheory {
    public static void main(String[] args) {
//        perfectNumberList();
//        primeNumberList();
//        perfectPrimeFactorList();
//        System.out.println(gcd(3456,1233));
    }
    public static boolean isPerfect(int aPosInt) {
        if (aPosInt <= 0) {
            return false;
        }
        int sum = 0;
        for (int divisor = 1; divisor <= aPosInt / 2; divisor++) {
            if (aPosInt % divisor == 0) {
                sum += divisor;
            }
        }
        return sum == aPosInt;
    }
    public static boolean isDeficientNumber(int aPosInt) {
        if (aPosInt <= 0) {
            return false;
        }
        int sum = 0;
        for (int divisor = 1; divisor <= aPosInt / 2; divisor++) {
            if (aPosInt % divisor == 0) {
                sum += divisor;
            }
        }
        return sum < aPosInt;
    }
    public static void printList(List<Integer> list) {
        if (list.size() == 0) {
            return;
        }
        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }
    public static void perfectNumberList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper bound");
        int upperBound = sc.nextInt();
        List<Integer> perfectNumbers = new ArrayList<>();
        List<Integer> neitherBoth = new ArrayList<>();
        for (int candidate = 2; candidate <= upperBound; candidate++) {
            if (isPerfect(candidate)) {
                perfectNumbers.add(candidate);
            }
            else if (!isDeficientNumber(candidate)) {
                neitherBoth.add(candidate);
            }
        }
        System.out.println("These numbers are perfect: ");
        printList(perfectNumbers);
        System.out.printf("[%d perfect numbers found (%.2f%%)]\n",
                perfectNumbers.size(),
                (double)perfectNumbers.size() * 100 / upperBound);

        System.out.println("These numbers are neither deficient nor perfect: ");
        printList(neitherBoth);
        System.out.printf("%d numbers found (%.2f%%)",
                neitherBoth.size(),
                (double)neitherBoth.size() * 100/ upperBound);

    }
    public static boolean isPrime(int aPosInt) {
        if (aPosInt < 1) {
            return false;
        }
        for (int divisor = 2; divisor <= Math.sqrt(aPosInt); divisor++) {
            if (aPosInt % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primeNumberList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper bound");
        int upperBound = sc.nextInt();
        List<Integer> primeNumbers = new ArrayList<>();
        for (int candidate = 1; candidate <= upperBound; candidate++) {
            if (isPrime(candidate)) {
                primeNumbers.add(candidate);
            }
        }
        System.out.println("These numbers are prime: ");
        printList(primeNumbers);
        System.out.printf("[%d prime numbers found (%.2f%%)]\n",
                primeNumbers.size(),
                (double) primeNumbers.size() * 100 / upperBound);

    }
    public static boolean isProductOfPrimeFactors(int aPosInt) {
        if (aPosInt <= 1) {
            return false;
        }
        int product = 1;
        for (int divisor = 2; divisor <= aPosInt / 2; divisor++) {
            if (aPosInt % divisor == 0 && isPrime(divisor)) {
                product *= divisor;
            }
        }
        return product == aPosInt;
    }
    public static void perfectPrimeFactorList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper bound");
        int upperBound = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        for (int candidate = 1; candidate <= upperBound; candidate++) {
            if (isProductOfPrimeFactors(candidate)) {
                result.add(candidate);
            }
        }
        printList(result);
        System.out.printf("[%d numbers are equal to the product of prime factors (%.2f%%)]\n",
                result.size(),
                (double) result.size() * 100 / upperBound);

    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
