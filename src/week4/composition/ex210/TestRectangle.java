package week4.composition.ex210;

import week4.composition.ex26.MyPoint;

public class TestRectangle {
    public static void main(String[] args) {
        // Create two MyPoint instances
        MyPoint point1 = new MyPoint(2, 4);
        MyPoint point2 = new MyPoint(6, 1);

        // Create a MyRectangle instance using MyPoint instances
        MyRectangle rectangle1 = new MyRectangle(point1, point2);
        System.out.println("Rectangle 1: " + rectangle1);

        // Test setters and getters
        rectangle1.setTopLeft(new MyPoint(1, 3));
        rectangle1.setBottomRight(new MyPoint(5, 0));
        System.out.println("Updated Rectangle 1: " + rectangle1);

        System.out.println("Top Left of Rectangle 1: " + rectangle1.getTopLeft());
        System.out.println("Bottom Right of Rectangle 1: " + rectangle1.getBottomRight());

        // Test area and perimeter
        System.out.println("Area of Rectangle 1: " + rectangle1.getArea());
        System.out.println("Perimeter of Rectangle 1: " + rectangle1.getPerimeter());
    }
}
