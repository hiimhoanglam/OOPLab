package week11.visitor.pseudocode;

public interface Shape {
    void move(int x, int y);
    void draw();
    void accept(Visitor v);
}
