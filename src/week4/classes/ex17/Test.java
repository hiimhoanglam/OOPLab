package week4.classes.ex17;

public class Test {
    public static void main(String[] args) {
        // Test constructor
        MyComplex complex1 = new MyComplex(1.1, 2.2);
        MyComplex complex2 = new MyComplex(3.3, 4.4);

        // Test toString()
        System.out.println("Complex Number 1: " + complex1); // Output: (1.1 + 2.2i)
        System.out.println("Complex Number 2: " + complex2); // Output: (3.3 + 4.4i)

        // Test getters and setters
        System.out.println("Real part of complex1: " + complex1.getReal()); // Output: 1.1
        System.out.println("Imaginary part of complex1: " + complex1.getImag()); // Output: 2.2

        complex1.setReal(5.5);
        complex1.setImag(6.6);
        System.out.println("Updated complex1: " + complex1); // Output: (5.5 + 6.6i)

        // Test setValue()
        complex2.setValue(7.7, 8.8);
        System.out.println("Updated complex2: " + complex2); // Output: (7.7 + 8.8i)

        // Test isReal() and isImaginary()
        System.out.println("Is complex1 real? " + complex1.isReal()); // Output: false
        System.out.println("Is complex1 imaginary? " + complex1.isImaginary()); // Output: false

        // Test equals()
        System.out.println("Are complex1 and complex2 equal? " + complex1.equals(7.7, 8.8)); // Output: false

        // Test magnitude() and argument()
        System.out.println("Magnitude of complex1: " + complex1.magnitude()); // Output: 9.301629167387822
        System.out.println("Argument of complex1: " + complex1.argument()); // Output: 0.870249367050138

        // Test add(), subtract(), multiply(), divide(), conjugate()
        MyComplex sum = complex1.addNew(complex2);
        System.out.println("Sum of complex1 and complex2: " + sum); // Output: (13.2 + 15.4i)

        MyComplex difference = complex1.subtractNew(complex2);
        System.out.println("Difference of complex1 and complex2: " + difference); // Output: (-2.2 - 2.2i)

        MyComplex product = complex1.multiply(complex2);
        System.out.println("Product of complex1 and complex2: " + product); // Output: (-82.5 + 114.18i)

        MyComplex quotient = complex1.divide(complex2);
        System.out.println("Quotient of complex1 and complex2: " + quotient); // Output: (0.5453382802101574 + 0.001028413631247206i)

        MyComplex conjugate = complex1.conjugate();
        System.out.println("Conjugate of complex1: " + conjugate); // Output: (5.5 - 6.6i)
    }
}
