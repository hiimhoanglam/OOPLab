package week4.classes.ex11;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The circle has radius of " + circle1.getRadius()
        + " and area of " + circle1.getArea());
        Circle circle2 = new Circle(2.0);
        System.out.println("The circle has radius of " + circle2.getRadius()
        + " and area of " + circle2.getArea());
        /*
        System.out.println(circle1.radius);
        circle1.radius = 5.0;
        This will raise error messages since the variable radius of the object Circle has its
        access modifier set to private, meaning that only functions and variables in the same class(Circle)
        can access it
         */
        Circle circle4 = new Circle();
        circle4.setRadius(5.5);
        System.out.println("Radius is: " + circle4.getRadius());
        circle4.setColor("green");
        System.out.println("Color is : " + circle4.getColor());
        /*
        System.out.println(circle4.setRadius(4.4));
        setters and getters return void
         */

    }
}
