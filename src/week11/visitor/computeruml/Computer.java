package week11.visitor.computeruml;

public class Computer implements ComputerPart{
    private ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor v) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(v);
        }
        v.visit(this);
    }
}
