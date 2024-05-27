package week10.decorator.pseudocode;

public class FileDataSource implements DataSource{
    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing " + data + " to file " + fileName);
    }

    @Override
    public String readData() {
        System.out.println("Reading data from file " + fileName);;
        return "Data from file " + fileName;
    }
}
