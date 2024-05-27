package week10.decorator.uml1;

public class ShapeDecorator implements Shape{
    private Shape wrappee;

    public ShapeDecorator(Shape shape) {
        this.wrappee = shape;
    }

    @Override
    public void draw() {
        wrappee.draw();
    }
}
