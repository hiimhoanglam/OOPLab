package week7.resizable;

public class TestResizableCircle {
    public static void main(String[] args) {
        // Create a ResizableCircle object with radius 5
        ResizableCircle circle = new ResizableCircle(5);

        // Test toString() method
        System.out.println("Initial Circle: " + circle); // Output: ResizableCircle[Circle[radius=5.0]]
        System.out.println("Area before resizing: " + circle.getArea());
        System.out.println("Perimeter before resizing: " + circle.getPerimeter());
        // Test resize method
        System.out.println("Resize by 50%:");
        circle.resize(50);
        System.out.println("After resizing: " + circle); // Output: ResizableCircle[Circle[radius=2.5]]

        System.out.println("Resize by 200%:");
        circle.resize(200);
        System.out.println("After resizing: " + circle); // Output: ResizableCircle[Circle[radius=5.0]]

        // Test getArea() and getPerimeter() after resizing
        System.out.println("Area after resizing: " + circle.getArea()); // Output: Area after resizing: 78.53981633974483
        System.out.println("Perimeter after resizing: " + circle.getPerimeter()); // Output: Perimeter after resizing: 31.41592653589793
    }
}
