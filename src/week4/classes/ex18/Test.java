package week4.classes.ex18;

public class Test {

    public static void main(String[] args) {
        double[] coeffs1 = {1, 2, 3};
        double[] coeffs2 = {4, 5, 6};

        // Create polynomials
        MyPolynomial polynomial1 = new MyPolynomial(coeffs1);
        MyPolynomial polynomial2 = new MyPolynomial(coeffs2);

        // Test getDegree
        System.out.println("Degree of polynomial1: " + polynomial1.getDegree());
        System.out.println("Degree of polynomial2: " + polynomial2.getDegree());

        // Test toString
        System.out.println("Polynomial1: " + polynomial1);
        System.out.println("Polynomial2: " + polynomial2);

        // Test evaluate
        double x = 1;
        System.out.println("Evaluation result for polynomial1 at x = " + x + ": " + polynomial1.evaluate(x));
        System.out.println("Evaluation result for polynomial2 at x = " + x + ": " + polynomial2.evaluate(x));

        // Test add
        polynomial1.add(polynomial2);
        System.out.println("Result of addition: " + polynomial1);

        // Test multiply
        polynomial1 = new MyPolynomial(coeffs1); // Reset polynomial1
        polynomial1.multiply(polynomial2);
        System.out.println("Result of multiplication: " + polynomial1);
    }

}
