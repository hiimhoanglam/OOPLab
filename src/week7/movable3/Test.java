package week7.movable3;

public class Test {
    public static void main(String[] args) {
        // Create a MovablePoint object
        MovablePoint point = new MovablePoint(3, 5, 2, 3);

        // Test toString() method
        System.out.println("Initial Point: " + point); // Output: (3,5) speed = (2,3)

        // Test move methods
        point.moveUp();
        System.out.println("After moving up: " + point); // Output: (3,8) speed = (2,3)

        point.moveLeft();
        System.out.println("After moving left: " + point); // Output: (1,8) speed = (2,3)

        point.moveDown();
        System.out.println("After moving down: " + point); // Output: (1,5) speed = (2,3)

        point.moveRight();
        System.out.println("After moving right: " + point); // Output: (3,5) speed = (2,3)
    }
}
