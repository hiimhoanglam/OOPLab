package week6.shape;

public class TestShape {
    public static void main(String[] args) {
        // Testing Shape class
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("blue", false);
        shape2.setColor("green");
        shape2.setFilled(true);
        System.out.println(shape2);

        // Testing Circle class
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(5.0);
        circle2.setColor("yellow");
        circle2.setFilled(true);
        System.out.println(circle2);
        System.out.println("Circle area: " + circle2.getArea());
        System.out.println("Circle perimeter: " + circle2.getPerimeter());

        // Testing Rectangle class
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(4.0, 6.0);
        rectangle2.setColor("purple");
        rectangle2.setFilled(true);
        System.out.println(rectangle2);
        System.out.println("Rectangle area: " + rectangle2.getArea());
        System.out.println("Rectangle perimeter: " + rectangle2.getPerimeter());

        // Testing Square class
        Square square1 = new Square();
        System.out.println(square1);

        Square square2 = new Square(3.0);
        square2.setColor("orange");
        square2.setFilled(true);
        System.out.println(square2);
        System.out.println("Square area: " + square2.getArea());
        System.out.println("Square perimeter: " + square2.getPerimeter());
    }
}
