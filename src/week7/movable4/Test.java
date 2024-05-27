package week7.movable4;

public class Test {
    public static void main(String[] args) {
        MovablePoint center = new MovablePoint(3, 5, 2, 3);

        // Create a MovableCircle object with the given center and radius
        MovableCircle circle = new MovableCircle(5, center);

        // Test toString() method
        System.out.println("Initial Circle: " + circle); // Output: (3,5) speed = (2,3), radius = 5

        // Test move methods
        circle.moveUp();
        System.out.println("After moving up: " + circle); // Output: (3,8) speed = (2,3), radius = 5

        circle.moveLeft();
        System.out.println("After moving left: " + circle); // Output: (1,8) speed = (2,3), radius = 5

        circle.moveDown();
        System.out.println("After moving down: " + circle); // Output: (1,5) speed = (2,3), radius = 5

        circle.moveRight();
        System.out.println("After moving right: " + circle); // Output: (3,5) speed = (2,3), radius = 5
    }
}
