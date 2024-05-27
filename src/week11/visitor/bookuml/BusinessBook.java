package week11.visitor.bookuml;

public class BusinessBook implements Book{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    public String getPublisher() {
        return "Business Publisher";
    }
}
