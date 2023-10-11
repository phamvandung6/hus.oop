package hus.oop.lab4._2_6;

public class TestMyPoint {
    public static void main(String[] args) {
        // Test program to test all constructors and public methods
        MyPoint point1 = new MyPoint(); // Test constructor
        System.out.println(point1); // Test toString()
        point1.setX(8); // Test setters
        point1.setY(6);
        System.out.println("x is: " + point1.getX()); // Test getters
        System.out.println("y is: " + point1.getY());
        point1.setXY(3, 0); // Test setXY()
        System.out.println(point1.getXY()[0]); // Test getXY()
        System.out.println(point1.getXY()[1]);
        System.out.println(point1);

        MyPoint point2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(point2);

        // Testing the overloaded distance() methods
        System.out.println(point1.distance(point2)); // which version?
        System.out.println(point2.distance(point1)); // which version?
        System.out.println(point1.distance(5, 6)); // which version?
        System.out.println(point1.distance()); // which version?
    }
}
