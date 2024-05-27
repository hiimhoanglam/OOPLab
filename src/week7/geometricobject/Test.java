package week7.geometricobject;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle:");
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Test Circle
        Circle circle = new Circle(3.5);
        System.out.println("\nCircle:");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Test polymorphism
        GeometricObject shape1 = new Rectangle(5.0, 8.0);
        System.out.println("\nShape 1 (Rectangle):");
        System.out.println(shape1);
        System.out.println("Area: " + shape1.getArea());
        System.out.println("Perimeter: " + shape1.getPerimeter());

        GeometricObject shape2 = new Circle(2.5);
        System.out.println("\nShape 2 (Circle):");
        System.out.println(shape2);
        System.out.println("Area: " + shape2.getArea());
        System.out.println("Perimeter: " + shape2.getPerimeter());
    }
}
