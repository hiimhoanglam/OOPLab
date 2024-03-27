package week5.bouncingballs;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(100, 100, 20, 5, 30);
        System.out.println(ball);

        ball.move();
        System.out.println(ball);

        ball.reflectHorizontal();
        System.out.println(ball);

        ball.reflectVertical();
        System.out.println(ball);

    }
}
