package week11.visitor.pseudocode;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("A circle moving to coordinate " + x + ", " + y);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void accept(Visitor v) {
        v.visitCircle(this);
    }
}
