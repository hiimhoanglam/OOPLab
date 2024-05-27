package week11.visitor.computeruml;

public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}
