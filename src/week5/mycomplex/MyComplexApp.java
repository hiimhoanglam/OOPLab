package week5.mycomplex;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();

        MyComplex complex1 = new MyComplex(real1, imag1);
        MyComplex complex2 = new MyComplex(real2, imag2);

        System.out.println("Complex number 1 is: " + complex1);
        System.out.println("Complex number 1 is real? " + complex1.isReal());
        System.out.println("Complex number 1 is imaginary? " + complex1.isImaginary());

        System.out.println("Complex number 2 is: " + complex2);
        System.out.println("Complex number 2 is real? " + complex2.isReal());
        System.out.println("Complex number 2 is imaginary? " + complex2.isImaginary());

        System.out.println("Complex number 1 is equal to complex number 2? " + complex1.equals(complex2));

        MyComplex sum = complex1.addNew(complex2);
        System.out.println("Sum of complex numbers: " + sum);

        scanner.close();
    }
}
