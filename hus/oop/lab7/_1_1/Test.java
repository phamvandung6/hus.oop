package hus.oop.lab7._1_1;

public class Test {
    public static void main(String[] args) {
        Shape shape1 = new Circle("red", true, 5.5);
        System.out.println(shape1);
        System.out.println("Area: " + shape1.getArea());
        System.out.println("Perimeter: " + shape1.getPerimeter());
        System.out.println("Color: " + shape1.getColor());
        System.out.println("Filled: " + shape1.isFilled());
        System.out.println("Radius: " + ((Circle) shape1).getRadius());

        Shape shape2 = new Rectangle("blue", true, 1.0, 2.0);
        System.out.println(shape2);
        System.out.println("Area: " + shape2.getArea());
        System.out.println("Perimeter: " + shape2.getPerimeter());
        System.out.println("Color: " + shape2.getColor());
        System.out.println("Filled: " + shape2.isFilled());
        System.out.println("Width: " + ((Rectangle) shape2).getWidth());
        System.out.println("Length: " + ((Rectangle) shape2).getLength());

        Shape shape3 = new Square("green", true, 3);
        System.out.println(shape3);
        System.out.println("Area: " + shape3.getArea());
        System.out.println("Perimeter: " + shape3.getPerimeter());
        System.out.println("Color: " + shape3.getColor());
        System.out.println("Filled: " + shape3.isFilled());
        System.out.println("Side: " + ((Square) shape3).getSide());
    }
}