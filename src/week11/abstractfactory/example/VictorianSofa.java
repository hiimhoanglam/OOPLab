package week11.abstractfactory.example;

public class VictorianSofa implements Sofa{
    @Override
    public void sleepOn() {
        System.out.println("Sleeping on victorian sofa");
    }
}
