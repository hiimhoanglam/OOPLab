package week10.decorator.uml2;

public class NutsToppingDecorator extends ToppingDecorator{
    public NutsToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String addTopping() {
        return "Nuts";
    }
}
