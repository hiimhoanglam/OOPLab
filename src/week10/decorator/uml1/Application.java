package week10.decorator.uml1;

public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        circle = new RedShapeDecorator(circle);
        circle.draw();
        circle = new BlueShapeDecorator(circle);
        circle.draw();
        circle = new RedShapeDecorator(circle);
        circle.draw();
    }
}
