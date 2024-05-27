package week11.abstractfactory;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Mac Button rendered");
    }
}
