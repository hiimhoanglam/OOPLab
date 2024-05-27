package week9.polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly{
    double[] derive() {
        double[] result = new double[this.coefficients().length - 1];
        for (int i = 1; i < degree() - 1; i++) {
            result[i-1] = coefficient(i) * i;
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractPoly poly = (AbstractPoly) obj;
        if (poly.degree() != this.degree()) {
            return false;
        }
        for (int i = 0; i < degree(); i++) {
            if (this.coefficient(i) != poly.coefficient(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int deg = 0; deg < degree() - 1; deg++) {
            sb.append(coefficient(deg)).append(" ");
            if (deg != 0) {
                sb.append("x ^ ").append(deg);
            }
            sb.append(" + ");
        }
        String result = sb.toString();
        return result.substring(0, result.length() - 3);
    }
}
