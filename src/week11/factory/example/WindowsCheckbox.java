package factory.abstractfactory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void onClick() {
        System.out.println("Windows checkbox");
    }
}
