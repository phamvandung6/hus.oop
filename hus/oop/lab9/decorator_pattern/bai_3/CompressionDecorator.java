package hus.oop.lab9.decorator_pattern.bai_3;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource source) {
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
