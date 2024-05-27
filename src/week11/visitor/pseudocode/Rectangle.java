package week11.visitor.pseudocode;

public class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("A rectangle moving to coordinate " + x + ", " + y);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void accept(Visitor v) {
        v.visitRectangle(this);
    }
}
