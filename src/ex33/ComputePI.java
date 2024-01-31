package ex33;

public class ComputePI {
    public static void main(String[] args) {
        double piDenominator = computePiDom(10000);
        double piTerm = computePi(10000);
        double domPercentage = (piDenominator / Math.PI) * 100;
        double termPercentage = (piTerm / Math.PI) * 100;
        System.out.println("Percentage using denominator " + domPercentage);
        System.out.println("Percentage using term " + termPercentage);
    }
    public static double computePiDom(int maxDenominator) {
        double sum = 0.0;
        for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 1 / (double) denominator;
            }
            if (denominator % 4 == 3) {
                sum -= 1 / (double) denominator;
            }
            else {
                System.out.println("Impossible");
            }
        }
        return sum;
    }
    public static double computePi(int maxTerm) {
        double sum = 0.0;
        for (int term = 1; term <= maxTerm; term++) {
            if (term % 2 == 1) {
                sum += 1 / (double) (term * 2 - 1);
            }
            else {
                sum -= 1 / (double) (term * 2 - 1);
            }
        }
        return sum;
    }
}
