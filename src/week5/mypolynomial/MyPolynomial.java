package week5.mypolynomial;

public class MyPolynomial {
    private double[] coeffs;
    private int degree;
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
        this.degree = coeffs.length - 1;
    }

    public int getDegree() {
        return degree;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public void setCoeffs(double[] coeffs) {
        this.coeffs = coeffs;
        this.degree = coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = degree; i >= 0; i--) {
            stringBuilder.append(coeffs[i]);
            if (i != 0) {
                stringBuilder.append(" * ").append("x^").append(i);
            }
            stringBuilder.append(" + ");
        }
        stringBuilder.delete(stringBuilder.length() - 3, stringBuilder.length());
        return stringBuilder.toString();
    }
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i <= degree; i++) {
            result += coeffs[i] * Math.pow(x,i);
        }
        return result;
    }
    public MyPolynomial add(MyPolynomial right) {
        if (this.getDegree() != right.getDegree()) {
            return null;
        }
        int degree = this.getDegree();
        for (int i = 0; i <= degree; i++) {
            coeffs[i] += right.getCoeffs()[i];
        }
        return this;
    }
    public MyPolynomial multiply(MyPolynomial right) {
        double[] result = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                result[i+j] += coeffs[i] * right.getCoeffs()[j];
            }
        }
        this.setCoeffs(result);
        return this;
    }
}
