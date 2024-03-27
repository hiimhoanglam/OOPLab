package week4.composition.ex28;

import week4.composition.ex26.MyPoint;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }


    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getCenterX() {
        return this.center.getX();
    }
    public void setCenterX(int x) {
        this.center.setX(x);
    }
    public int getCenterY() {
        return this.center.getY();
    }
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    public int[] getCenterXY() {
        return new int[]{getCenterX(),getCenterY()};
    }
    public void setCenterXY(int x, int y) {
        setCenterX(x);
        setCenterY(y);
    }

    @Override
    public String toString() {
        return "MyCircle[" +
                "center=" + center +
                ", radius=" + radius +
                ']';
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double distance(MyCircle another) {
        return this.center.distance(another.getCenter());
    }
}
