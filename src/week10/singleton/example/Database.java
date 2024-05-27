package week10.singleton.example;

public class Database {
    private static volatile Database instance;

    private Database() {
        System.out.println("SQL Database initialized");
    }
    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }
    public void query() {
        System.out.println("All the rows and columns of the database");
    }
}
