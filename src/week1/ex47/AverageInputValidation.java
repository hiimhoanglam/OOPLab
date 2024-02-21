package week1.ex47;

import java.util.Scanner;

public class AverageInputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        validatingInput(sc);
    }
    public static void validatingInput(Scanner sc) {
        boolean isValid = false;
        int numberIn;
        int numStudents = 1;
        int sum = 0;
        do {
            System.out.println("Enter a mark (0-100) for student " + numStudents + ": ");
            numberIn = sc.nextInt();
            if (0 <= numberIn && numberIn <= 10 || (90 <= numberIn && numberIn <= 100)) {
                isValid = true;
                numStudents++;
                sum += numberIn;
            }
            else {
                System.out.println("Invalid input, try again");
            }
        } while (!isValid);
        System.out.printf("The average is : %.2f", (sum / (double)numStudents));
    }
}
