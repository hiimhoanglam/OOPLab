package week11.visitor.computeruml;

public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}
