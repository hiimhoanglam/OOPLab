package week6.composition;

public class LineSub extends Point{
    Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX,beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }
    public Point getBegin() {
        return this;
    }
    public void setBegin(Point begin) {
        super.setXY(begin.getX(), begin.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX() {
        return super.getX();

    }
    public int getBeginY() {
        return super.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    public void setBeginX(int x) {
        super.setX(x);
    }
    public void setBeginY(int y) {
        super.setY(y);
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public void setEndXY(int x, int y) {
        end.setXY(x,y);
    }
    public double getLength() {
        double xDiff = end.getX() - super.getX();
        double yDiff = end.getY() - super.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public double getGradient() {
        double xDiff = end.getX() - super.getX();
        double yDiff = end.getY() - super.getY();
        return Math.atan2(yDiff, xDiff);
    }
}
