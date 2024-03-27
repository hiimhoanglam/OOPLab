package week6.point;

public class TestPoint {
    public static void main(String[] args) {
        // Test cases for Point2D class
        Point2D point2D1 = new Point2D();
        System.out.println("Point 2D 1: " + point2D1);

        Point2D point2D2 = new Point2D(3.5f, 4.2f);
        System.out.println("Point 2D 2: " + point2D2);

        point2D1.setX(2.0f);
        point2D1.setY(5.0f);
        System.out.println("Updated Point 2D 1: " + point2D1);

        // Test cases for Point3D class
        Point3D point3D1 = new Point3D();
        System.out.println("\nPoint 3D 1: " + point3D1);

        Point3D point3D2 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point 3D 2: " + point3D2);

        point3D1.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("Updated Point 3D 1: " + point3D1);

        // Additional test cases for Point3D class
        Point3D point3D3 = new Point3D();
        point3D3.setX(7.0f);
        point3D3.setY(8.0f);
        point3D3.setZ(9.0f);
        System.out.println("\nPoint 3D 3: " + point3D3);

        point3D2.setXY(10.0f, 11.0f);
        point3D2.setZ(12.0f);
        System.out.println("Updated Point 3D 2: " + point3D2);
    }
}

