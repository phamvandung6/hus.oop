package hus.oop.lab7._1_1;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square [Rectangle[Shape" + super.toString() + "], width = " + getSide() + ", lenght=" + getSide() + "]";
    }
}
