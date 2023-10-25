package hus.oop.lab6._1_6;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width - 1;
        this.y2 = y + height - 1;
    }

    public int getX() {
        return this.x1;
    }

    public int getY() {
        return this.y1;
    }

    public int getWidth() {
        return this.x2 - this.x1 + 1;
    }

    public int getHeight() {
        return this.y2 - this.y1 + 1;
    }

    public boolean collidesWith(Ball ball) {
        if (ball.getX() - ball.getRadius() <= x1 || ball.getX() + ball.getRadius() >= x2) {
            ball.reflectHorizontal();
            return true;
        }

        if (ball.getY() - ball.getRadius() <= y1 || ball.getY() + ball.getRadius() >= y2) {
            ball.reflectVertical();
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Container [(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")]";
    }

    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);

        for (int step = 0; step < 100; ++step) {
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball); // manual check the position of the ball
        }
    }
}