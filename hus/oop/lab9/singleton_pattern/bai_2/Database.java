package hus.oop.lab9.singleton_pattern.bai_2;

public class Database {
    // Biến static để lưu trữ thể hiện duy nhất của lớp Database
    private static Database instance;

    // Hàm khởi tạo private để ngăn việc tạo đối tượng từ bên ngoài lớp
    private Database() {

    }

    // Phương thức static để truy xuất đến thể hiện duy nhất của lớp Database
    public static Database getInstance() {
        // Kiểm tra nếu instance chưa được khởi tạo
        if (instance == null) {
            // Tạo một thể hiện mới của lớp Database và gán cho instance
            instance = new Database();
        }
        // Trả về thể hiện duy nhất của lớp Database
        return instance;
    }

    // Phương thức query để thực hiện một câu lệnh SQL
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}