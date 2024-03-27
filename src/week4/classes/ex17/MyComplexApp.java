package week4.classes.ex17;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        MyComplex complex1 = new MyComplex(real1, imag1);

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        MyComplex complex2 = new MyComplex(real2, imag2);

        System.out.println("Number 1 is: " + complex1);
        System.out.println(complex1 + " is " + (complex1.isReal() ? "" : "not ") + "a pure real number");
        System.out.println(complex1 + " is " + (complex1.isImaginary() ? "" : "not ") + "a pure imaginary number");
        System.out.println("Number 2 is: " + complex2);
        System.out.println(complex2 + " is " + (complex2.isReal() ? "" : "not ") + "a pure real number");
        System.out.println(complex2 + " is " + (complex2.isImaginary() ? "" : "not ") + "a pure imaginary number");
        System.out.println(complex1 + " is " + (complex1.equals(complex2) ? "" : "not ") + "equal to " + complex2);
        System.out.println(complex1 + " + " + complex2 + " = " + complex1.add(complex2));

        scanner.close();
    }
}
