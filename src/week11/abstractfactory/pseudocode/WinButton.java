package week11.abstractfactory;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("Window Button rendered");
    }
}
