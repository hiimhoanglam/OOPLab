package week11.visitor.pseudocode;

public class Dot implements Shape{
    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("A dot moving to coordinate " + x + ", " + y);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a dot");
    }

    @Override
    public void accept(Visitor v) {
        v.visitDot(this);
    }
}
