package hus.oop.lab6._1_7;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = 0.0f;
    }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Ball ball) {
        float dx = ball.getX() - this.x;
        float dy = ball.getY() - this.y;
        float dz = ball.getZ() - this.z;
        float distance = (float) Math.sqrt(dx * dx + dy * dy + dz * dz);
        return distance < 8.0f;
    }

    public void kick(Ball ball) {
        if (near(ball)) {
            float newZ = ball.getZ() + 10.0f;
            ball.setXYZ(ball.getX(), ball.getY(), newZ);
            System.out.println("Player kicked the ball. New position of the ball: " + ball);
        } else {
            System.out.println("Player cannot kick the ball. The ball is not near.");
        }
    }
}
