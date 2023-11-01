package hus.oop.lab7._1_5;

public class TestCircle {
    public static void main(String[] args) {
        // Create a Circle object with radius 5
        Circle circle = new Circle(5);

        // Test the toString method
        System.out.println(circle.toString());

        // Test the getPerimeter method
        double perimeter = circle.getPerimeter();
        System.out.println("Perimeter: " + perimeter);

        // Test the getArea method
        double area = circle.getArea();
        System.out.println("Area: " + area);
    }
}