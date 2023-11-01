package hus.oop.lab7._1_5;

public class TestResizableCircle {
    public static void main(String[] args) {
        // Create a ResizableCircle object with radius 5
        ResizableCircle resizableCircle = new ResizableCircle(5);

        // Test the toString method
        System.out.println(resizableCircle.toString());

        // Test the resize method
        resizableCircle.resize(50);

        // Test the getPerimeter method
        double perimeter = resizableCircle.getPerimeter();
        System.out.println("Perimeter: " + perimeter);

        // Test the getArea method
        double area = resizableCircle.getArea();
        System.out.println("Area: " + area);
    }
}