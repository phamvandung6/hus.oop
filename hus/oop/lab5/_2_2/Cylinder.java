package hus.oop.lab5._2_2;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public double getBaseArea() {
        return base.getArea();
    }

    public double getBaseCircumference() {
        return base.getCircumference();
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public double getSurfaceArea() {
        return (2 * base.getArea()) + (base.getCircumference() * height);
    }
}