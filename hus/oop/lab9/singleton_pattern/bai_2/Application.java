package hus.oop.lab9.singleton_pattern.bai_2;

class Application {
    public static void main(String[] args) {
        // Lấy thể hiện duy nhất của lớp Database thông qua phương thức getInstance()
        Database foo = Database.getInstance();
        // Gọi phương thức query() trên thể hiện foo để thực hiện một câu lệnh SQL
        foo.query("SELECT * FROM customers");
        // ...

        // Lấy lại thể hiện duy nhất của lớp Database thông qua phương thức getInstance()
        // Vì đã có một thể hiện tồn tại trước đó, nên biến bar sẽ chứa cùng một đối tượng với biến foo
        Database bar = Database.getInstance();
        // Gọi phương thức query() trên thể hiện bar để thực hiện một câu lệnh SQL khác
        bar.query("INSERT INTO orders VALUES (...)");

        // Biến 'bar' sẽ chứa cùng một đối tượng với biến 'foo'
        System.out.println("foo and bar refer to the same Database instance: " + (foo == bar)); //true
    }
}