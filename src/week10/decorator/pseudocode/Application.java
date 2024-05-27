package week10.decorator.pseudocode;

public class Application {
    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource("portfolio.txt");
        String dataRecords = "Andrew-2004-Basketball";
        dataSource.writeData(dataRecords);
        dataSource = new EncryptionDecorator(dataSource);
        dataSource.writeData(dataRecords);
        dataSource = new CompressionDecorator(dataSource);
        dataSource.writeData(dataRecords);
    }
}
