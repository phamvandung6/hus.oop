package hus.oop.lab9.decorator_pattern.bai_3;

public class FileDataSource implements DataSource {
    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String readData() {
        return null;
    }

    @Override
    public void writeData(String data) {
    }
}
