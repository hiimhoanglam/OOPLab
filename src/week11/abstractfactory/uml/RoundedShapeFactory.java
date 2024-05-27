package week11.abstractfactory.uml;

public class RoundedShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("square")) {
            return new RoundedSquare();
        }
        else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new RoundedRectangle();
        }
        else {
            throw new RuntimeException("Invalid shape type");
        }
    }
}
