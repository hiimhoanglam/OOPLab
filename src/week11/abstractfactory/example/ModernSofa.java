package week11.abstractfactory.example;

public class ModernSofa implements Sofa{
    @Override
    public void sleepOn() {
        System.out.println("Sleeping on modern sofa");
    }
}
