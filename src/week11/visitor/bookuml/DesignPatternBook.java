package week11.visitor.bookuml;

public class DesignPatternBook implements ProgrammingBook{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "Gangs of Four";
    }
}
