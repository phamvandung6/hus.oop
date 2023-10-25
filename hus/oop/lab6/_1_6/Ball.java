package hus.oop.lab6._1_6;

public class Ball {
    private int x;
    private int y;
    private int radius;
    private double xDelta;
    private double yDelta;

    public Ball(int x, int y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * Math.cos(Math.toRadians(direction));
        this.yDelta = -speed * Math.sin(Math.toRadians(direction)); // Inverted y-axis
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getXDelta() {
        return xDelta;
    }

    public void setXDelta(double xDelta) {
        this.xDelta = xDelta;
    }

    public double getYDelta() {
        return yDelta;
    }

    public void setYDelta(double yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + ", " + y + "), speed = (" + xDelta + ", " + yDelta + ")";
    }
}