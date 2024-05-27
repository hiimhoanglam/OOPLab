package week12.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficients;
    private int size;

    /**
     * Initializes the polynomial with a default capacity.
     */
    public ArrayPolynomial() {
        coefficients = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Returns the coefficient at the specified index.
     * @param index the index of the coefficient to return.
     * @return the coefficient at the specified index.
     */
    @Override
    public double coefficient(int index) {
        if (index < 0 || index >= size) {
            return 0;
        }
        return coefficients[index];
    }

    /**
     * Returns an array of all coefficients.
     * @return an array containing all coefficients of the polynomial.
     */
    @Override
    public double[] coefficients() {
        double[] coeffsCopy = new double[size];
        System.arraycopy(coefficients, 0, coeffsCopy, 0, size);
        return coeffsCopy;
    }

    /**
     * Appends a coefficient to the end of the polynomial.
     * @param coefficient the coefficient to append.
     * @return the current polynomial.
     */
    public ArrayPolynomial append(double coefficient) {
        if (size == coefficients.length) {
            enlarge();
        }
        coefficients[size++] = coefficient;
        return this;
    }

    /**
     * Inserts a coefficient at the specified index.
     * @param coefficient the coefficient to insert.
     * @param index the index where the coefficient will be inserted.
     * @return the current polynomial.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (size == coefficients.length) {
            enlarge();
        }
        System.arraycopy(coefficients, index, coefficients, index + 1, size - index);
        coefficients[index] = coefficient;
        size++;
        return this;
    }

    /**
     * Sets the coefficient at the specified index.
     * @param coefficient the coefficient to set.
     * @param index the index where the coefficient will be set.
     * @return the current polynomial.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        coefficients[index] = coefficient;
        return this;
    }

    /**
     * Returns the degree of the polynomial.
     * @return the degree of the polynomial.
     */
    @Override
    public int degree() {
        return size - 1;
    }

    /**
     * Evaluates the polynomial for a given value of x.
     * @param x the value to evaluate the polynomial at.
     * @return the value of the polynomial at x.
     */
    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = size - 1; i >= 0; i--) {
            result = result * x + coefficients[i];
        }
        return result;
    }

    /**
     * Returns the derivative of the polynomial.
     * @return a new polynomial representing the derivative of the current polynomial.
     */
    @Override
    public Polynomial derivative() {
        if (size <= 1) {
            return new ArrayPolynomial();
        }
        ArrayPolynomial derivative = new ArrayPolynomial();
        for (int i = 1; i < size; i++) {
            derivative.append(coefficients[i] * i);
        }
        return derivative;
    }

    /**
     * Adds another polynomial to the current polynomial.
     * @param another the polynomial to add.
     * @return the current polynomial.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        int maxSize = Math.max(this.size, another.size);
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double thisCoeff = i < this.size ? this.coefficient(i) : 0;
            double anotherCoeff = i < another.size ? another.coefficient(i) : 0;
            result.append(thisCoeff + anotherCoeff);
        }
        return result;
    }

    /**
     * Subtracts another polynomial from the current polynomial.
     * @param another the polynomial to subtract.
     * @return the current polynomial.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        int maxSize = Math.max(this.size, another.size);
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double thisCoeff = i < this.size ? this.coefficient(i) : 0;
            double anotherCoeff = i < another.size ? another.coefficient(i) : 0;
            result.append(thisCoeff - anotherCoeff);
        }
        return result;
    }

    /**
     * Multiplies the current polynomial with another polynomial.
     * @param another the polynomial to multiply with.
     * @return the current polynomial.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        int newSize = this.size + another.size - 1;
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < newSize; i++) {
            result.append(0);
        }
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < another.size; j++) {
                result.coefficients[i + j] += this.coefficients[i] * another.coefficients[j];
            }
        }
        result.size = newSize;
        return result;
    }

    /**
     * Enlarges the internal array to accommodate more coefficients.
     */
    private void enlarge() {
        double[] newCoefficients = new double[coefficients.length * 2];
        System.arraycopy(coefficients, 0, newCoefficients, 0, coefficients.length);
        coefficients = newCoefficients;
    }
}
