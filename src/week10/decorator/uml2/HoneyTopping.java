package week10.decorator.uml2;

public class HoneyTopping extends ToppingDecorator{
    public HoneyTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String addTopping() {
        return "Honey";
    }
}
