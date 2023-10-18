package hus.oop.lab4._1_7;

public class TestMain {
    public static void main(String[] args) {
        // Test constructor and toString()
        Date date1 = new Date(1, 2, 2014);
        System.out.println(date1); // toString()

        // Test Setters and Getters
        date1.setMonth(12);
        date1.setDay(9);
        date1.setYear(2099);
        System.out.println(date1); // toString()
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Day: " + date1.getDay());
        System.out.println("Year: " + date1.getYear());

        // Test setDate()
        date1.setDate(3, 4, 2016);
        System.out.println(date1); // toString()
    }
}