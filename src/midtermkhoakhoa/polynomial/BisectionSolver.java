package midtermkhoakhoa.polynomial;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp chia đôi (Bisection)
     * @param polynomial
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        /* TODO */
        if (polynomial.evaluate(lower) * polynomial.evaluate(upper) >=0) {
            System.out.println("You have not assumed"
                    + " right a and b");
            return -1;
        }
        int n = 1;
        double c = lower;
        while (n <= maxIterations) {
            c = (lower + upper) / 2;
            if (Double.compare(polynomial.evaluate(c), 0.0) == 0 || (upper - lower) < tolerance) {
                return c;
            }
            else if (polynomial.evaluate(c) * polynomial.evaluate(lower) > 0.0) {
                lower = c;
            }
            else {
                upper = c;
            }
            n++;
        }
        return c;
    }
}
