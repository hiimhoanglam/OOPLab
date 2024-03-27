package week4.classes.ex18;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree() {
        return this.coeffs.length - 1;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    @Override
    public String toString() {
        StringBuilder poly = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            poly.append(coeffs[i]).
                    append(" * ").
                    append("x^").
                    append(i).
                    append(" + ");
        }
        poly.delete(poly.length() - 5, poly.length());
        return poly.toString();
    }
    public double evaluate(double x) {
        double result = 0;
        for (int i = getDegree(); i >= 0; i--) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }
    public MyPolynomial add(MyPolynomial right) {
        if (this.getDegree() != right.getDegree()) {
            return null;
        }
        for (int i = 0; i <= getDegree(); i++) {
            coeffs[i] += right.getCoeffs()[i];
        }
        return this;
    }
    public MyPolynomial multiply(MyPolynomial right) {
        double[] resultCoeffs = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.getCoeffs().length; j++) {
                resultCoeffs[i+j] += this.coeffs[i] * right.getCoeffs()[j];
            }
        }
        this.coeffs = resultCoeffs;
        return this;
    }
}
