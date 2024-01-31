package ex35;

public class ExtractDigits {
    public static void main(String[] args) {
        extractDigit(15423);
    }
    public static void extractDigit(int n) {
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n /= 10;
        }
    }
}
