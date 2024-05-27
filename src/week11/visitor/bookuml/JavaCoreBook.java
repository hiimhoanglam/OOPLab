package week11.visitor.bookuml;

public class JavaCoreBook implements ProgrammingBook{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "JavaCore is everywhere";
    }
}
