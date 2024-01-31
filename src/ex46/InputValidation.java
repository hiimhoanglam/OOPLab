package ex46;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        validatingInput(sc);
    }
    public static void validatingInput(Scanner sc) {
        boolean isValid = false;
        int numberIn;
        do {
            System.out.println("Enter a number between 0-10 or 90-100");
            numberIn = sc.nextInt();
            if (0 <= numberIn && numberIn <= 10 || (90 <= numberIn && numberIn <= 100)) {
                isValid = true;
            }
            else {
                System.out.println("Invalid input, try again");
            }
        } while (!isValid);
    }
}
