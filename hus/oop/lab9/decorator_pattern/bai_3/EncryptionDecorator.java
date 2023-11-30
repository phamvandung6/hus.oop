package hus.oop.lab9.decorator_pattern.bai_3;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public String readData() {
        return null;
    }

    @Override
    public void writeData(String data) {

    }
}
