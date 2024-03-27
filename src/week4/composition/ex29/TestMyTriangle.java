package week4.composition.ex29;

public class TestMyTriangle {
    public static void main(String[] args) {
        // Create different instances of MyTriangle
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        MyTriangle triangle2 = new MyTriangle(1, 1, 4, 1, 1, 5);
        MyTriangle triangle3 = new MyTriangle(-2, -2, 2, -2, 0, 2);

        // Print the triangles
        System.out.println("Triangle 1: " + triangle1);
        System.out.println("Triangle 2: " + triangle2);
        System.out.println("Triangle 3: " + triangle3);

        // Test perimeter
        System.out.println("Perimeter of Triangle 1: " + triangle1.getPerimeter());
        System.out.println("Perimeter of Triangle 2: " + triangle2.getPerimeter());
        System.out.println("Perimeter of Triangle 3: " + triangle3.getPerimeter());

        // Test type
        System.out.println("Type of Triangle 1: " + triangle1.getType());
        System.out.println("Type of Triangle 2: " + triangle2.getType());
        System.out.println("Type of Triangle 3: " + triangle3.getType());
    }
}
