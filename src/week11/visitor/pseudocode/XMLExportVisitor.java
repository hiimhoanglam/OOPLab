package week11.visitor.pseudocode;

public class XMLExportVisitor implements Visitor{
    @Override
    public void visitDot(Dot d) {
        System.out.println(d.getX());
        System.out.println(d.getY());
        d.draw();
        d.move(10,10);
    }

    @Override
    public void visitCircle(Circle c) {
        System.out.println(c.getRadius());
        c.draw();
        c.move(10, 10);
    }

    @Override
    public void visitRectangle(Rectangle r) {
        System.out.println(r.getWidth());
        System.out.println(r.getHeight());
        r.draw();
        r.move(10,10);
    }

    @Override
    public void visitCompoundShape(CompoundShape cs) {
        System.out.println(cs.getId());
        cs.draw();
        cs.move(10,10);
    }
}
