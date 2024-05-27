package week10.singleton.pseudocode;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static volatile ChocolateBoiler instance;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }
    public static synchronized ChocolateBoiler getInstance() {
        if (instance == null) {
            synchronized (ChocolateBoiler.class) {
                if (instance == null) {
                    System.out.println("Creating the first unique instance of CB");
                    instance = new ChocolateBoiler();
                }
            }
        }
        else {
            System.out.println("Returning previous instance of Chocolate Boiler");
        }
        return instance;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filling the boiler with a milk mixture");
        }
    }
    public void drain() {
        if (!isEmpty() && !isBoiled()) {
            empty = true;
            System.out.println("Draining the mixture");
        }
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("Boiling the mixture");
            boiled = true;
        }
    }
}
