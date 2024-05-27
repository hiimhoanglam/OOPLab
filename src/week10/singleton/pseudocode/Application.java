package week10.singleton.pseudocode;

public class Application {
    public static void main(String[] args) {
        ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
        boiler1.fill();
        boiler1.boil();
        boiler1.drain();

        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        boiler2.fill();
        boiler2.boil();
        boiler2.drain();
    }
}
