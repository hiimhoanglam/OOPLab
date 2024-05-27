package week11.abstractfactory.example;

public class Application {
    private FurnitureFactory factory;
    private Chair chair;
    private Table table;
    private Sofa sofa;

    public Application(FurnitureFactory factory) {
        this.factory = factory;
    }
    public void manufacture() {
        this.chair = factory.createChair();
        this.table = factory.createTable();
        this.sofa = factory.createSofa();
    }
    public void work() {
        this.chair.sitOn();
        this.table.workOn();
        this.sofa.sleepOn();
    }
}
