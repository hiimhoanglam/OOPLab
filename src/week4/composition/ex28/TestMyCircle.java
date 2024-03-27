package week4.composition.ex28;

import week4.composition.ex26.MyPoint;

public class TestMyCircle {
    public static void main(String[] args) {
        // Test constructors and toString()
        MyCircle circle1 = new MyCircle();
        System.out.println("Circle 1: " + circle1);

        MyCircle circle2 = new MyCircle(3, 4, 5);
        System.out.println("Circle 2: " + circle2);

        MyPoint center = new MyPoint(1, 1);
        MyCircle circle3 = new MyCircle(center, 7);
        System.out.println("Circle 3: " + circle3);

        // Test setters and getters
        circle1.setCenter(new MyPoint(2, 2));
        circle1.setRadius(3);
        System.out.println("Updated Circle 1: " + circle1);

        System.out.println("Center X of Circle 1: " + circle1.getCenterX());
        System.out.println("Center Y of Circle 1: " + circle1.getCenterY());
        System.out.println("Radius of Circle 1: " + circle1.getRadius());

        circle1.setCenterXY(5, 6);
        System.out.println("Updated Circle 1 after setting Center XY: " + circle1);

        System.out.println("Center XY of Circle 1: " + java.util.Arrays.toString(circle1.getCenterXY()));

        // Test area and circumference
        System.out.println("Area of Circle 1: " + circle1.getArea());
        System.out.println("Circumference of Circle 1: " + circle1.getCircumference());

        // Test distance between circles
        System.out.println("Distance between Circle 1 and Circle 3: " + circle1.distance(circle3));
    }
}

