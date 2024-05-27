package week10.decorator.pseudocode;

public class CompressionDecorator extends DataSourceDecorator{
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Compressing data " + data);
        super.writeData(data + " COMPRESSED");
    }

    @Override
    public String readData() {
        String data = super.readData();
        System.out.println("Decompressing " + data);
        return data + " DECOMPRESSED";
    }
}
