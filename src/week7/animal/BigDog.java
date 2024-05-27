package week7.animal;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Big woof");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Big big woof");
    }
    public void greets(BigDog another) {
        System.out.println("Big big big woof");
    }
}
