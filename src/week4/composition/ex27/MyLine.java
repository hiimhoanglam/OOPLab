package week4.composition.ex27;

import week4.composition.ex26.MyPoint;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    public MyLine(int x1, int y1, int x2, int y2) {
        new MyLine(new MyPoint(x1,y1), new MyPoint(x2,y2));
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX() {
        return this.begin.getX();
    }
    public void setBeginX(int x) {
        this.begin.setX(x);
    }
    public int getBeginY() {
        return this.begin.getY();
    }
    public void setBeginY(int y) {
        this.begin.setY(y);
    }
    public int getEndX() {
        return this.end.getX();
    }
    public void setEndX(int x) {
        this.end.setX(x);
    }
    public int getEndY() {
        return this.end.getY();
    }
    public void setEndY(int y) {
        this.end.setY(y);
    }
    public int[] getBeginXY() {
        return new int[]{this.begin.getX(), this.begin.getY()};
    }
    public void setBeginXY(int x, int y) {
        this.begin.setX(x);
        this.begin.setY(y);
    }
    public int[] getEndXY() {
        return new int[]{this.end.getX(), this.end.getY()};
    }
    public void setEndXY(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }
    public double getLength() {
        return this.begin.distance(this.end);
    }

    public double getGradient() {
        int yDiff = getEndY() - getBeginY();
        int xDiff = getEndX() - getBeginX();
        return Math.atan2(yDiff,xDiff);

    }

    @Override
    public String toString() {
        return "MyLine[" +
                "begin=" + begin +
                ", end=" + end +
                ']';
    }
}
