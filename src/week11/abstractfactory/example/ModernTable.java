package week11.abstractfactory.example;

public class ModernTable implements Table{
    @Override
    public void workOn() {
        System.out.println("Working on modern table");
    }
}
