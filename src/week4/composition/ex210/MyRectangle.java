package week4.composition.ex210;

import week4.composition.ex26.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

    public double getArea() {
        int width = Math.abs(topLeft.getX() - bottomRight.getX());
        int height = Math.abs(topLeft.getY() - bottomRight.getY());
        return width * height;
    }

    public double getPerimeter() {
        int width = Math.abs(topLeft.getX() - bottomRight.getX());
        int height = Math.abs(topLeft.getY() - bottomRight.getY());
        return 2 * (width + height);
    }
}
