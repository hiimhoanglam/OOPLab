package week10.decorator.uml1;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.print(" RED ");
        System.out.println();
    }
}
