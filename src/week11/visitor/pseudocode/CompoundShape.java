package week11.visitor.pseudocode;

public class CompoundShape implements Shape{
    private int id;

    public CompoundShape(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("A compound shape moving to coordinate " + x + ", " + y);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a compound shape");
    }

    @Override
    public void accept(Visitor v) {
        v.visitCompoundShape(this);
    }
}
