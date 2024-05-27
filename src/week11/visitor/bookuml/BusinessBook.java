package week11.visitor.computeruml;

public class BusinessBook implements Book{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    public String getPublisher() {
        return "Business Publisher";
    }
}
