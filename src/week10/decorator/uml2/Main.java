package week10.decorator.uml2;

public class Main {
    public static void main(String[] args) {
        IceCream vanillaIceCream = new VanillaIceCream();
        IceCream honeyVanillaIceCream = new HoneyTopping(vanillaIceCream);
        System.out.println(honeyVanillaIceCream.getDescription());
        IceCream nutsHoneyVanilla = new NutsToppingDecorator(honeyVanillaIceCream);
        System.out.println(nutsHoneyVanilla.getDescription());
        IceCream doubleHoneyNutsVanilla = new HoneyTopping(nutsHoneyVanilla);
        System.out.println(doubleHoneyNutsVanilla.getDescription());
    }
}
