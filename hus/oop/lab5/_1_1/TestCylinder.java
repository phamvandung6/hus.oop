package hus.oop.lab5._1_1;

public class TestCylinder {
    public static void main(String[] args) {
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder:");
        System.out.println("radius=" + cylinder1.getRadius());
        System.out.println("height=" + cylinder1.getHeight());
        System.out.println("base area=" + cylinder1.getArea());
        System.out.println("volume=" + cylinder1.getVolume());

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("Cylinder:");
        System.out.println("radius=" + cylinder2.getRadius());
        System.out.println("height=" + cylinder2.getHeight());
        System.out.println("base area=" + cylinder2.getArea());
        System.out.println("volume=" + cylinder2.getVolume());

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:");
        System.out.println("radius=" + cylinder3.getRadius());
        System.out.println("height=" + cylinder3.getHeight());
        System.out.println("base area=" + cylinder3.getArea());
        System.out.println("volume=" + cylinder3.getVolume());
    }
}