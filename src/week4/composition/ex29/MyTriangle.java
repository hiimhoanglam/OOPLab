package week4.composition.ex29;

import week4.composition.ex26.MyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ']';
    }
    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }
    public String getType() {
        double v1v3 = v1.distance(v3);
        double v2v3 = v2.distance(v3);
        double v1v2 = v1.distance(v2);
        if (v1v3 == v2v3 && v2v3 == v1v2) {
            return "Equilateral";
        }
        else if (v1v3 != v2v3 && v2v3 != v1v2) {
            return "Scalene";
        }
        return "Isosceles";
    }
}
