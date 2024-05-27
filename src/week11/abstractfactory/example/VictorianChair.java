package week11.abstractfactory.example;

public class VictorianChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Sitting on victorian chair");
    }
}
