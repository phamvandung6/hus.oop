package hus.oop.lab9.decorator_pattern.bai_3;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }
}
