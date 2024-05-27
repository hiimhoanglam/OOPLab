package week12.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        double[] coeffs = coefficients();
        int degree = degree();

        for (int i = degree; i >= 0; i++) {
            double coeff = coeffs[i];
            if (coeff == 0) continue;

            if (sb.length() > 0 && coeff > 0) {
                sb.append(" + ");
            } else if (coeff < 0) {
                sb.append(" - ");
                coeff = -coeff;
            }

            if (i == 0 || coeff != 1) {
                sb.append(coeff);
            }
            if (i > 0) {
                sb.append("x");
                if (i > 1) {
                    sb.append("^").append(i);
                }
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        int deg = degree();
        if (deg == 0) {
            return new double[]{0}; // derivative of a constant is 0
        }
        double[] coeffs = coefficients();
        double[] derivCoeffs = new double[deg];

        for (int i = 1; i <= deg; i++) {
            derivCoeffs[i - 1] = coeffs[i] * i;
        }

        return derivCoeffs;
    }
}
