package week5.mypolynomial;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial poly1 = new MyPolynomial(1, 2, 3); // 3x^2 + 2x + 1
        MyPolynomial poly2 = new MyPolynomial(3, 4, 5); // 5x^2 + 4x + 3

        System.out.println("Polynomial 1: " + poly1);
        System.out.println("Polynomial 2: " + poly2);

        System.out.println("Degree of polynomial 1: " + poly1.getDegree());
        System.out.println("Degree of polynomial 2: " + poly2.getDegree());

        double x = 2;
        System.out.println("Evaluation of polynomial 1 at x = " + x + ": " + poly1.evaluate(x));
        System.out.println("Evaluation of polynomial 2 at x = " + x + ": " + poly2.evaluate(x));

        MyPolynomial sum = poly1.add(poly2);
        System.out.println("Sum of polynomials: " + sum);

        MyPolynomial product = poly1.multiply(poly2);
        System.out.println("Product of polynomials: " + product);
    }
}
