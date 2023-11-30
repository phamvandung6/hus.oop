package hus.oop.lab9.decorator_pattern.bai_3;

class SalaryManager {
    private DataSource source;

    public SalaryManager(DataSource source) {
        this.source = source;
    }

    public String load() {
        return source.readData();
    }

    public void save() {
        source.writeData("salaryRecords");
    }
}
