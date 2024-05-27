package week11.abstractfactory.pseudocode;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("Window Button rendered");
    }
}
