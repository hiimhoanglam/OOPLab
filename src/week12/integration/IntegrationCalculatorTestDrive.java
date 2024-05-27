package week12.integration;

import java.util.Arrays;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        System.out.println("-----------ArrayPolynomial Tests-----------");

        ArrayPolynomial poly1 = new ArrayPolynomial();
        poly1.append(3).append(0).append(2); // 3 + 2x^2
        System.out.println("poly1: " + Arrays.toString(poly1.coefficients())); // [3.0, 0.0, 2.0]

        ArrayPolynomial poly2 = new ArrayPolynomial();
        poly2.append(1).append(1); // 1 + x
        System.out.println("poly2: " + Arrays.toString(poly2.coefficients())); // [1.0, 1.0]

        ArrayPolynomial sum = poly1.plus(poly2); // 4 + x + 2x^2
        System.out.println("poly1 + poly2: " + Arrays.toString(sum.coefficients())); // [4.0, 1.0, 2.0]

        ArrayPolynomial diff = poly1.minus(poly2); // 2 - x + 2x^2
        System.out.println("poly1 - poly2: " + Arrays.toString(diff.coefficients())); // [2.0, -1.0, 2.0]

        ArrayPolynomial prod = poly1.multiply(poly2); // 3 + 3x + 2x^2 + 2x^3
        System.out.println("poly1 * poly2: " + Arrays.toString(prod.coefficients())); // [3.0, 3.0, 2.0, 2.0]

        double value = poly1.evaluate(2); // 3 + 2 * 2^2 = 11
        System.out.println("poly1(2): " + value); // 11.0
    }

    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        System.out.println("-----------ListPolynomial Tests-----------");

        ListPolynomial poly1 = new ListPolynomial();
        poly1.append(3).append(0).append(2); // 3 + 2x^2
        System.out.println("poly1: " + Arrays.toString(poly1.coefficients())); // [3.0, 0.0, 2.0]

        ListPolynomial poly2 = new ListPolynomial();
        poly2.append(1).append(1); // 1 + x
        System.out.println("poly2: " + Arrays.toString(poly2.coefficients())); // [1.0, 1.0]

        ListPolynomial sum = poly1.plus(poly2); // 4 + x + 2x^2
        System.out.println("poly1 + poly2: " + Arrays.toString(sum.coefficients())); // [4.0, 1.0, 2.0]

        ListPolynomial diff = poly1.minus(poly2); // 2 - x + 2x^2
        System.out.println("poly1 - poly2: " + Arrays.toString(diff.coefficients())); // [2.0, -1.0, 2.0]

        ListPolynomial prod = poly1.multiply(poly2); // 3 + 3x + 2x^2 + 2x^3
        System.out.println("poly1 * poly2: " + Arrays.toString(prod.coefficients())); // [3.0, 3.0, 2.0, 2.0]

        double value = poly1.evaluate(2); // 3 + 2 * 2^2 = 11
        System.out.println("poly1(2): " + value); // 11.0
    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */
        System.out.println("-----------IntegrationCalculator Tests-----------");

        Polynomial poly = new ArrayPolynomial().append(1).append(0).append(-1); // 1 - x^2
        System.out.println("Polynomial: " + Arrays.toString(poly.coefficients())); // [1.0, 0.0, -1.0]

        IntegrationCalculator calculator = new IntegrationCalculator(poly);

        // Test with Midpoint Rule
        Integrator midpoint = new MidpointRule(0.001, 1000);
        calculator.setIntegrator(midpoint);
        double midpointResult = calculator.integrate(0, 1); // ∫(1 - x^2) dx
        System.out.println("Midpoint Rule result: " + midpointResult);

        // Test with Simpson Rule
        Integrator simpson = new SimpsonRule(0.001, 1000);
        calculator.setIntegrator(simpson);
        double simpsonResult = calculator.integrate(0, 1); // ∫(1 - x^2) dx
        System.out.println("Simpson Rule result: " + simpsonResult);

        // Test with Trapezoid Rule
        Integrator trapezoid = new TrapezoidRule(0.001, 1000);
        calculator.setIntegrator(trapezoid);
        double trapezoidResult = calculator.integrate(0, 1); // ∫(1 - x^2) dx
        System.out.println("Trapezoid Rule result: " + trapezoidResult);
    }
}
