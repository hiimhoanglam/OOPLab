package week11.visitor.bookuml;

public class VisitorImplementation implements Visitor{
    @Override
    public void visit(BusinessBook book) {
        System.out.println(book.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println(book.getResource());
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println(book.getResource());
    }
}
