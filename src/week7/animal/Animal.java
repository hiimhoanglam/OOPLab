package week7.animal;

public abstract class Animal {
    private String name;
    public abstract void greets();

    public Animal(String name) {
        this.name = name;
    }
}
