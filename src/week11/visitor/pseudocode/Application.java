package week11.visitor.pseudocode;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<Shape> shapes = new ArrayList<>();

    public Application(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public Application() {
        shapes.add(new Circle(10));
        shapes.add(new Rectangle(50,50));
        shapes.add(new Dot(100,100));
        shapes.add(new CompoundShape(69));
    }
    public void export() {
        Visitor exportVisitor = new XMLExportVisitor();
        for (Shape shape: shapes) {
            shape.accept(exportVisitor);
        }

    }
}
