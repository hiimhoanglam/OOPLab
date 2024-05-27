package week12.integration;

public class SimpsonRule implements Integrator {
    private double precision;
    private int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly the polynomial to integrate.
     * @param lower the lower bound of the interval.
     * @param upper the upper bound of the interval.
     * @return the approximated integral value.
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        int n = 2; // initial number of subintervals (must be even)
        double I_n = integrate(poly, lower, upper, n);
        double I_2n;

        for (int i = 0; i < maxIterations; i++) {
            n *= 2;
            I_2n = integrate(poly, lower, upper, n);

            if (Math.abs(I_2n - I_n) / 15 < precision) {
                return I_2n;
            }

            I_n = I_2n;
        }

        return I_n; // Return the last computed value if precision criterion not met within maxIterations
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals (số chẵn) khoảng phân hoạch đều.
     * @param poly the polynomial to integrate.
     * @param lower the lower bound of the interval.
     * @param upper the upper bound of the interval.
     * @param numOfSubIntervals the number of subintervals to partition the interval (must be even).
     * @return the approximated integral value.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        if (numOfSubIntervals % 2 != 0) {
            throw new IllegalArgumentException("Number of subintervals must be even.");
        }

        double h = (upper - lower) / numOfSubIntervals;
        double sum = poly.evaluate(lower) + poly.evaluate(upper);

        for (int i = 1; i < numOfSubIntervals; i++) {
            double x = lower + i * h;
            if (i % 2 == 0) {
                sum += 2 * poly.evaluate(x);
            } else {
                sum += 4 * poly.evaluate(x);
            }
        }

        return sum * (h / 3);
    }
}
