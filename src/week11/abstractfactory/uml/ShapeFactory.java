package week11.abstractfactory.uml;

public class ShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        else {
            throw new RuntimeException("Invalid shape type");
        }
    }
}
