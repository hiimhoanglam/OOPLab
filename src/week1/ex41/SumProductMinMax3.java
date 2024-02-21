package week1.ex41;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
    public static void sumProduct3(Scanner sc) {
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        sc.close();
        int sum;
        int product;
        int min;
        int max;
        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        min = Math.min(number1,Math.min(number2,number3));
        max = Math.min(number1, Math.min(number2,number3));
        System.out.println("Sum is " + sum);
        System.out.println("Product is " + product);
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
    }
    public static void sumProduct5(Scanner sc) {
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();
        int number5 = sc.nextInt();
        sc.close();
        int sum;
        int product;
        int min;
        int max;
        sum = number1 + number2 + number3 + number4 + number5;
        product = number1 * number2 * number3 * number4 * number5;
        min = Math.min(number1,Math.min(number2,Math.min(number3, Math.min(number4,number5))));
        max = Math.max(number1,Math.max(number2,Math.max(number3, Math.max(number4,number5))));
        System.out.println("Sum is " + sum);
        System.out.println("Product is " + product);
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
    }
}
