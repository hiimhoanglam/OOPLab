package ex42;

import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        computeSphere(sc);
    }
    public static void computeSphere(Scanner sc) {
        System.out.println("Enter radius");
        double radius = sc.nextDouble();
        sc.close();
        double area = 4 * Math.PI * radius * radius;
        double volume = (4.0/3) * Math.PI * radius * radius * radius;

        System.out.printf("Area is %.2f \n", area);
        System.out.printf("Diameter is %.2f \n", volume);

    }
}
