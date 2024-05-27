package week12.integration;

import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Initializes the polynomial with default values.
     */
    public ListPolynomial() {
        this.coefficients = new ArrayList<>();
    }

    /**
     * Returns the coefficient at the specified index.
     * @param index the index of the coefficient to return.
     * @return the coefficient at the specified index.
     */
    @Override
    public double coefficient(int index) {
        if (index < 0 || index >= coefficients.size()) {
            return 0;
        }
        return coefficients.get(index);
    }

    /**
     * Returns an array of all coefficients.
     * @return an array containing all coefficients of the polynomial.
     */
    @Override
    public double[] coefficients() {
        double[] coeffsArray = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coeffsArray[i] = coefficients.get(i);
        }
        return coeffsArray;
    }

    /**
     * Appends a coefficient to the end of the polynomial.
     * @param coefficient the coefficient to append.
     * @return the current polynomial.
     */
    public ListPolynomial append(double coefficient) {
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Inserts a coefficient at the specified index.
     * @param coefficient the coefficient to insert.
     * @param index the index where the coefficient will be inserted.
     * @return the current polynomial.
     */
    public ListPolynomial insert(double coefficient, int index) {
        if (index < 0 || index > coefficients.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sets the coefficient at the specified index.
     * @param coefficient the coefficient to set.
     * @param index the index where the coefficient will be set.
     * @return the current polynomial.
     */
    public ListPolynomial set(double coefficient, int index) {
        if (index < 0 || index >= coefficients.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Returns the degree of the polynomial.
     * @return the degree of the polynomial.
     */
    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    /**
     * Evaluates the polynomial for a given value of x.
     * @param x the value to evaluate the polynomial at.
     * @return the value of the polynomial at x.
     */
    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = coefficients.size() - 1; i >= 0; i--) {
            result = result * x + coefficients.get(i);
        }
        return result;
    }

    /**
     * Returns the derivative of the polynomial.
     * @return a new polynomial representing the derivative of the current polynomial.
     */
    @Override
    public Polynomial derivative() {
        ListPolynomial derivative = new ListPolynomial();
        for (int i = 1; i < coefficients.size(); i++) {
            derivative.append(coefficients.get(i) * i);
        }
        return derivative;
    }

    /**
     * Adds another polynomial to the current polynomial.
     * @param another the polynomial to add.
     * @return the current polynomial.
     */
    public ListPolynomial plus(ListPolynomial another) {
        int maxSize = Math.max(this.coefficients.size(), another.coefficients.size());
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double thisCoeff = i < this.coefficients.size() ? this.coefficient(i) : 0;
            double anotherCoeff = i < another.coefficients.size() ? another.coefficient(i) : 0;
            result.append(thisCoeff + anotherCoeff);
        }
        return result;
    }

    /**
     * Subtracts another polynomial from the current polynomial.
     * @param another the polynomial to subtract.
     * @return the current polynomial.
     */
    public ListPolynomial minus(ListPolynomial another) {
        int maxSize = Math.max(this.coefficients.size(), another.coefficients.size());
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double thisCoeff = i < this.coefficients.size() ? this.coefficient(i) : 0;
            double anotherCoeff = i < another.coefficients.size() ? another.coefficient(i) : 0;
            result.append(thisCoeff - anotherCoeff);
        }
        return result;
    }

    /**
     * Multiplies the current polynomial with another polynomial.
     * @param another the polynomial to multiply with.
     * @return the current polynomial.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        int newSize = this.coefficients.size() + another.coefficients.size() - 1;
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < newSize; i++) {
            result.append(0.0);
        }
        for (int i = 0; i < this.coefficients.size(); i++) {
            for (int j = 0; j < another.coefficients.size(); j++) {
                double newCoeff = result.coefficients.get(i + j) + this.coefficients.get(i) * another.coefficients.get(j);
                result.coefficients.set(i + j, newCoeff);
            }
        }
        return result;
    }
}
