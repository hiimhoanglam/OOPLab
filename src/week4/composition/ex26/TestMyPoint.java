package week4.composition.ex26;

public class TestMyPoint {
    public static void main(String[] args) {
        // Test constructors and toString()
        MyPoint point1 = new MyPoint(); // Test constructor
        System.out.println(point1); // Test toString()

        // Test setters
        point1.setX(8);
        point1.setY(6);

        // Test getters
        System.out.println("x is: " + point1.getX());
        System.out.println("y is: " + point1.getY());
        point1.setXY(3, 0); // Test setXY()
        System.out.println(point1.getXY()[0]); // Test getXY()
        System.out.println(point1.getXY()[1]);
        System.out.println(point1);

        MyPoint point2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(point2);

        // Testing the overloaded distance() methods
        System.out.println(point1.distance(point2)); // which version?
        System.out.println(point2.distance(point1)); // which version?
        System.out.println(point1.distance(5, 6)); // which version?
        System.out.println(point1.distance()); // which version?

        MyPoint[] points = new MyPoint[10]; // Declare and allocate an array of MyPoint

        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1); // Allocate each of MyPoint instances
        }

        // Use a loop to print all the points
        for (int i = 0; i < points.length; i++) {
            System.out.println("Point " + (i + 1) + ": " + points[i]);
        }
    }
}

