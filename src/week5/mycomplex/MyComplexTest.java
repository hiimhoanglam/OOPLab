package week5.mycomplex;

public class MyComplexTest {
    public static void main(String[] args) {
        // Test constructor and setters
        MyComplex complex1 = new MyComplex(1.1, 2.2);
        MyComplex complex2 = new MyComplex(3.3, 4.4);

        // Test getters
        System.out.println("Complex number 1: " + complex1);
        System.out.println("Complex number 2: " + complex2);

        // Test isReal and isImaginary
        System.out.println("Complex number 1 is real? " + complex1.isReal());
        System.out.println("Complex number 1 is imaginary? " + complex1.isImaginary());
        System.out.println("Complex number 2 is real? " + complex2.isReal());
        System.out.println("Complex number 2 is imaginary? " + complex2.isImaginary());

        // Test equals
        System.out.println("Complex number 1 is equal to complex number 2? " + complex1.equals(complex2));

        // Test magnitude
        System.out.println("Magnitude of complex number 1: " + complex1.magnitude());
        System.out.println("Magnitude of complex number 2: " + complex2.magnitude());

        // Test addInto and addNew
        MyComplex sum = complex1.addNew(complex2);
        System.out.println("Sum of complex numbers: " + sum);
        complex1.addInto(complex2);
        System.out.println("Complex number 1 after adding complex number 2 into it: " + complex1);
    }
}