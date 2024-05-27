package week9.polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly{
    List<Double> coefficients = new ArrayList<>();

    public ListPoly(double[] coefficients) {
        for (double coefficient: coefficients) {
            this.coefficients.add(coefficient);
        }
    }

    @Override
    public double[] coefficients() {
        double[] coefficients = new double[this.coefficients.size()];
        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = this.coefficients.get(i);
        }
        return coefficients;
    }

    @Override
    public double coefficient(int degree) {
        if (degree < 0 || degree > degree()) {
            return -1;
        }
        return this.coefficients.get(degree);
    }

    @Override
    public int degree() {
        return this.coefficients.size() + 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }
}
