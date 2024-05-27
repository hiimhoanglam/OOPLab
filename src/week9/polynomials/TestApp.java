package week9.polynomials;

public class TestApp {
    public static void main(String[] args) {
        Poly ap = new ArrayPoly(new double[]{1, 3, 4, 8});
        Poly lp = new ListPoly(new double[]{1, 3, 4, 8});

        System.out.println("ap = " + ap);
        System.out.println("lp = " + lp);

        ap = ap.derivative();
        System.out.println("ap' = " + ap.toString());
        ap = ap.derivative();
        System.out.println("ap'' = " + ap.toString());

        lp = lp.derivative();
        System.out.println("lp' = " + lp.toString());
        lp = lp.derivative();
        System.out.println("lp'' = " + lp.toString());
    }
}
