package week7.movable8;

public class Test {
    public static void main(String[] args) {
        // Create a MovableRectangle object with coordinates (1, 4) for topLeft and (5, 1) for bottomRight,
        // and speeds 2 for x-axis and 3 for y-axis
        MovableRectangle rectangle = new MovableRectangle(1, 4, 5, 1, 2, 3);

        // Test move methods
        System.out.println("Initial Rectangle:");
        System.out.println(rectangle); // Expected output: (1, 4) to (5, 1)

        rectangle.moveUp();
        System.out.println("After moving up:");
        System.out.println(rectangle); // Expected output: (1, 7) to (5, 4)

        rectangle.moveLeft();
        System.out.println("After moving left:");
        System.out.println(rectangle); // Expected output: (-1, 7) to (3, 4)

        rectangle.moveDown();
        System.out.println("After moving down:");
        System.out.println(rectangle); // Expected output: (-1, 4) to (3, 1)

        rectangle.moveRight();
        System.out.println("After moving right:");
        System.out.println(rectangle); // Expected output: (1, 4) to (5, 1)
    }
}
