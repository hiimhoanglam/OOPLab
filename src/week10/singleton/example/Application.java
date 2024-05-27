package week10.singleton.example;

public class Application {
    public static void main(String[] args) {
        Database sqlDB1 = Database.getInstance();
        sqlDB1.query();
        Database sqlDB2 = Database.getInstance();
        sqlDB2.query();
    }
}
