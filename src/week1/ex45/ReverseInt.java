package week1.ex45;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseInteger(sc);
    }
    public static void reverseInteger(Scanner sc) {
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        int result = 0;
        while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
        System.out.println("The reverse is " + result);
    }
}
