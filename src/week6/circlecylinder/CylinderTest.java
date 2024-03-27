package week6.circlecylinder;

public class CylinderTest {
    public static void main(String[] args) {
        // Test cases for Cylinder class

        // Test default constructor
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder 1:");
        System.out.println("Height: " + cylinder1.getHeight());
        System.out.println("Volume: " + cylinder1.getVolume());
        System.out.println("Surface Area: " + cylinder1.getArea());

        // Test constructor with height parameter
        Cylinder cylinder2 = new Cylinder(5.0);
        System.out.println("\nCylinder 2:");
        System.out.println("Height: " + cylinder2.getHeight());
        System.out.println("Volume: " + cylinder2.getVolume());
        System.out.println("Surface Area: " + cylinder2.getArea());

        // Test constructor with radius, color, and height parameters
        Cylinder cylinder3 = new Cylinder(3.0, "blue", 7.0);
        System.out.println("\nCylinder 3:");
        System.out.println("Height: " + cylinder3.getHeight());
        System.out.println("Volume: " + cylinder3.getVolume());
        System.out.println("Surface Area: " + cylinder3.getArea());
    }
}