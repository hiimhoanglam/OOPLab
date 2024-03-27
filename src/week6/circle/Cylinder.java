package week6.circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 1.0;
    }
    public Cylinder(double radius) {
        super(radius);
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return this.height * super.getArea();
    }
    /*
    If we override the getArea method to calculate the area of the cylinder as
    2 * pi * r * h + 2 * pi * r^2
    The call this.height + getArea() can not work anymore since getArea has been overriden by
    the getArea in the Cylinder class
    in order to call the getArea of the superclass, we call super.getArea();
     */
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder[" +
                "height=" + height +
                ']' + super.toString();
    }
}
