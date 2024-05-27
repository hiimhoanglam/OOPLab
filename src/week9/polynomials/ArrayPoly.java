package week9.polynomials;

public class ArrayPoly extends AbstractPoly{
    double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double[] coefficients() {
        return this.coefficients;
    }

    @Override
    public double coefficient(int degree) {
        if (degree < 0 || degree > degree()) {
            return -1;
        }
        return coefficients[degree];
    }

    @Override
    public int degree() {
        return this.coefficients.length + 1;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }
}
