package week10.decorator.uml2;

public abstract class ToppingDecorator implements IceCream{
    private IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " " + addTopping();
    }
    public abstract String addTopping();
}
