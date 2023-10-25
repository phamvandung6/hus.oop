package hus.oop.lab6._1_7;

public class BallTest {
    public static void main(String[] args) {
        Ball ball = new Ball(10.0f, 20.0f, 30.0f);
        
        System.out.println("Initial position: " + ball);
        
        float x = ball.getX();
        float y = ball.getY();
        float z = ball.getZ();
        System.out.println("Current position: (" + x + ", " + y + ", " + z + ")");
        
        ball.setXYZ(40.0f, 50.0f, 60.0f);
        System.out.println("New position: " + ball);
    }
}