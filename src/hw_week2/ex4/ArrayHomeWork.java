package hw_week2.ex4;

import java.util.Scanner;

public class ArrayHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printArrayStars(scanner);
    }

    public static void printArrayStars(Scanner in) {
        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = in.nextInt();
        int[] items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < NUM_ITEMS; i++) {
            items[i] = in.nextInt();
        }

        for (int i = 0; i < NUM_ITEMS; i++) {
            System.out.print((i + 1) + " : ");
            printStars(items[i]);
            System.out.println("(" + items[i] + ")");
        }
    }

    public static void printStars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
    }
}
