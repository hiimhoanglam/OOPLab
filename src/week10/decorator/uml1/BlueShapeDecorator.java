package week10.decorator.uml1;

public class BlueShapeDecorator extends ShapeDecorator{
    public BlueShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.print(" BLUE ");
        System.out.println();
    }
}
