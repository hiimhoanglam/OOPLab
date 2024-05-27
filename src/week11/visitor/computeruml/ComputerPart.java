package week11.visitor.computeruml;



public interface ComputerPart {
    void accept(ComputerPartVisitor v);
}
