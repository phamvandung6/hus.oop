package hus.oop.lab6._1_7;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player(10, 0.0f, 0.0f);
        Ball ball = new Ball(5.0f, 5.0f, 0.0f);

        System.out.println("Initial position: Ball - (" + ball.getX() + ", " + ball.getY() + ", " + ball.getZ() + ")");

        player.move(3.0f, 4.0f);

        player.jump(2.0f);

        boolean isNear = player.near(ball);
        System.out.println("Is the ball near the player? " + isNear);
    }
}