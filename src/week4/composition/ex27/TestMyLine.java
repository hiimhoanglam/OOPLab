package week4.composition.ex27;

import week4.composition.ex26.MyPoint;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 1);
        MyPoint point2 = new MyPoint(5, 5);

        // Create a MyLine instance using MyPoint instances
        MyLine line1 = new MyLine(point1, point2);
        System.out.println("Line 1: " + line1);

        // Test setters and getters
        line1.setBegin(new MyPoint(2, 2));
        line1.setEnd(new MyPoint(6, 6));
        System.out.println("Updated Line 1: " + line1);

        System.out.println("Begin X: " + line1.getBeginX());
        System.out.println("Begin Y: " + line1.getBeginY());
        System.out.println("End X: " + line1.getEndX());
        System.out.println("End Y: " + line1.getEndY());

        line1.setBeginXY(3, 3);
        line1.setEndXY(7, 7);
        System.out.println("Updated Line 1 after setting XY: " + line1);

        System.out.println("Begin XY: " + java.util.Arrays.toString(line1.getBeginXY()));
        System.out.println("End XY: " + java.util.Arrays.toString(line1.getEndXY()));

        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Gradient of Line 1: " + line1.getGradient());
    }
}
