package week11.visitor.bookuml;

public interface Visitor {
    void visit(BusinessBook book);
    void visit(DesignPatternBook book);
    void visit(JavaCoreBook book);
}
