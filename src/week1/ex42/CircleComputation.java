package week1.ex42;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        computeCircle(sc);
    }
    public static void computeCircle(Scanner sc) {
        System.out.println("Enter radius");
        double radius = sc.nextDouble();
        sc.close();
        double diameter = 2 * radius;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.printf("Diameter is %.2f \n", diameter);
        System.out.printf("Area is %.2f \n", area);
        System.out.printf("Circumference is %.2f \n", circumference);
    }
}
