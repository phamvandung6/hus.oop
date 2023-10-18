package hus.oop.lab4._1_4;

public class TestMain {
    public static void main(String[] args) {
        // Test constructor and toString()
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1); // toString()

        // Test Setters and Getters
        employee1.setSalary(999);
        System.out.println(employee1); // toString()
        System.out.println("id is: " + employee1.getID());
        System.out.println("first name is: " + employee1.getFirstName());
        System.out.println("last name is: " + employee1.getLastName());
        System.out.println("salary is: " + employee1.getSalary());
        System.out.println("name is: " + employee1.getName());
        System.out.println("annual salary is: " + employee1.getAnnualSalary()); // Test method

        // Test raiseSalary()
        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);
    }
}
