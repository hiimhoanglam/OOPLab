package week10.decorator.pseudocode;

public class EncryptionDecorator extends DataSourceDecorator{
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Encrypting " + data);
        super.writeData(data + " ENCRYPTED");
    }

    @Override
    public String readData() {
        String data = super.readData();
        System.out.println("Decrypting data " + data);
        return data + " DECRYPTED";
    }
}
