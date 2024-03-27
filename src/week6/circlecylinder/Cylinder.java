package week6.circlecylinder;
/*
Composition is better than inheritance because it provides flexibility for our systems

 */
public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        this.base = new Circle();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        this.base = new Circle();
        this.height = height;
    }
    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius,color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return this.height * base.getArea();
    }
    public double getArea() {
        return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
    }


    @Override
    public String toString() {
        return "Cylinder[" +
                "height=" + height +
                ']' + super.toString();
    }
}
