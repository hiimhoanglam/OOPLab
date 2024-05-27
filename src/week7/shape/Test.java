package week7.shape;

public class Test {
    public static void main(String[] args) {
        // Upcast Circle to Shape
        Shape shape1 = new Circle(5.5, "red", false);
        System.out.println(shape1); // which version? circle version
        System.out.println(shape1.getArea()); // which version? circle version
        System.out.println(shape1.getPerimeter()); // which version? circle version
        /*All of this are getting the implementation of Circle because the nature of this object is still Circle, it just
        is Circle, it just got upcasted to Shape but the nature doesn't change
        */
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        System.out.println(((Circle) shape1).getRadius());
        /*You have to downcast shape1 again to get the radius because
        shape1 does not have features of Circle
        */
        // Downcast back to Circle
        Circle circle1 = (Circle) shape1;
        //Only circle implementations
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());

//        Shape shape2 = new Shape(); You cannot instantiate abstract classes

        Shape shape3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
        System.out.println(((Rectangle)shape3).getLength());
        // System.out.println(shape3.getLength()); // getLength() is not defined in the Shape class
        //To get the getLength method, you have to downcast shape3 to length

        //Downcast shape3 to rectangle type
        Rectangle rectangle1 = (Rectangle) shape3;
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.getLength()); // Assuming getLength() exists in Rectangle class


        Shape shape4 = new Square(6.6);
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());

        Rectangle rectangle2 = (Rectangle) shape4;
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getColor());
        System.out.println(rectangle2.getLength());
// System.out.println(rectangle2.getSide()); // getSide() is not defined in the Rectangle class
        System.out.println(((Square)rectangle2).getSide());
        //You have to downcast rectangle2 to square type

        Square square1 = (Square) rectangle2;
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
// System.out.println(square1.getLength()); // getLength() is not defined in the Square class
    }
    /*
    Abstract methods and classes are considered a blueprint for subclasses to follow. It is just like a house blueprint
    and any houses that are designed according to this blueprint must follow the common features of the blueprint. Abstraction
    can provide insight into how polymorphism work: a method can have different implementation based on the class, a class can be
    in many shapes and forms. Abstraction hides the details of how a class work, only show to the end-user the general purpose of a method
    and class. The detail are made for subclasses to take care of
     */
}
