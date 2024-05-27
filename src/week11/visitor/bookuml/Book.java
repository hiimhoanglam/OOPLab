package week11.visitor.bookuml;

public interface Book {
    void accept(Visitor v);
}
