package week11.abstractfactory.uml;

public class FactoryProducer {
    AbstractFactory abstractFactory;
    Shape shape;
    boolean rounded;

    public FactoryProducer(boolean rounded) {
        this.rounded = rounded;
        if (rounded) {
            this.abstractFactory = new RoundedShapeFactory();
        }
        else {
            this.abstractFactory = new ShapeFactory();
        }
    }
    public AbstractFactory getFactory() {
        return abstractFactory;
    }
    public void createShape(String shapeType) {
        shape = abstractFactory.getShape(shapeType);
    }
    public void draw() {
        shape.draw();
    }
}
