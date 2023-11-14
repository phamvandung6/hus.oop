package hus.homework.week8._2._2_2;

import java.util.HashMap;

/**
 * A PhoneBook implementation internally using HashMap
 */
public class PhoneBookMap implements PhoneBook {
    private HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    // Em dùng phone là key bởi vì nó là riêng biệt
    public void addPerson(Student s) {
        phoneBook.put(s.getPhone(), s);
    }

    public Student searchByName(String name) {
        for (Student student : phoneBook.values()) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public Student searchByLastname(String lastname) {
        for (Student student : phoneBook.values()) {
            if (student.getLastname().equals(lastname)) {
                return student;
            }
        }
        return null;
    }

    public Student searchByNumber(String phone) {
        return phoneBook.get(phone);
    }

    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}