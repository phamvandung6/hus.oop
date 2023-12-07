package hus.oop.lab10.builder_pattern.bai_2;

/*
 * Builder Pattern cho phép chúng ta xây dựng đối tượng Person bước từng bước, cho 
 * phép chúng ta tuỳ chỉnh các thuộc tính và bỏ qua các thuộc tính không bắt buộc. Điều này 
 * giúp tạo ra mã nguồn dễ đọc, dễ hiểu và dễ bảo trì.
 */
public class Client {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("John")
                .age(25)
                .gender("Male")
                .address("123 Main Street")
                .build();

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Address: " + person.getAddress());
    }
}
