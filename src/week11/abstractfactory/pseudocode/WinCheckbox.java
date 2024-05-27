package week11.abstractfactory;

public class WinCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Win checkbox rendered");
    }
}
