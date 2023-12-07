package hus.oop.lab10.builder_pattern.bai_2;

/*
 * Giả sử chúng ta có một lớp Person với các thuộc tính như name, age, gender, và address. 
 * Để tạo đối tượng Person, chúng ta có thể sử dụng Builder Pattern để xây dựng
 * (builder) cho lớp này.
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private String gender;
        private String address;

        private Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}