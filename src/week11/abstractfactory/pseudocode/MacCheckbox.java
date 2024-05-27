package week11.abstractfactory;

public class MacCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Mac checkbox painted");
    }
}
