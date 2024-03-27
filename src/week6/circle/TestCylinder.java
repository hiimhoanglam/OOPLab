package week6.circle;

public class TestCylinder {

    public static void main(String[] args) {
        // Declare and allocate a new instance of Cylinder with default color, radius, and height
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder 1:" + cylinder1);
        System.out.println("Radius = " + cylinder1.getRadius());
        System.out.println("Height = " + cylinder1.getHeight());
        System.out.println("Base Area = " + cylinder1.getArea());
        System.out.println("Volume = " + cylinder1.getVolume());

        // Declare and allocate a new instance of Cylinder specifying height, with default color and radius
        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("Cylinder 2:" + cylinder2);
        System.out.println("Radius = " + cylinder2.getRadius());
        System.out.println("Height = " + cylinder2.getHeight());
        System.out.println("Base Area = " + cylinder2.getArea());
        System.out.println("Volume = " + cylinder2.getVolume());

        // Declare and allocate a new instance of Cylinder specifying radius and height, with default color
        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder 3:" + cylinder3);
        System.out.println("Radius = " + cylinder3.getRadius());
        System.out.println("Height = " + cylinder3.getHeight());
        System.out.println("Base Area = " + cylinder3.getArea());
        System.out.println("Volume = " + cylinder3.getVolume());
    }
}
