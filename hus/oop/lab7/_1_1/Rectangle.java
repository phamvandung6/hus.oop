package hus.oop.lab7._1_1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(String color, Boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.length = lenght;
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.length = lenght;
    }

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double lenght) {
        this.length = lenght;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle [Shape[" + super.toString() + "], width=" + width + ", lenght=" + length + "]";
    }

}
