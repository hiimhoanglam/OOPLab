package ex42;

import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        computeCylinder(sc);
    }
    public static void computeCylinder(Scanner sc) {
        System.out.println("Enter radius");
        double radius = sc.nextDouble();
        System.out.println("Enter height");
        double height = sc.nextDouble();
        sc.close();
        double baseArea = Math.PI * radius * radius;
        double surfaceArea = 2 * Math.PI * radius + 2 * baseArea;
        double volume = baseArea * height;

        System.out.printf("Base Area is %.2f \n", baseArea);
        System.out.printf("Surface area is %.2f \n", surfaceArea);
        System.out.printf("Volume is %.2f \n", volume);
    }
}
