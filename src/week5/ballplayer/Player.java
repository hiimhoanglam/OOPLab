package week5.ballplayer;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y, float z) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }
    public void jump(float zDisp) {
        this.z += zDisp;
    }
    public boolean near(Ball ball) {
        float zDiff = (float) Math.pow(ball.getZ() - z,2);
        float yDiff = (float) Math.pow(ball.getY() - y,2);
        float xDiff = (float) Math.pow(ball.getX() - x,2);
        return Math.sqrt(zDiff + yDiff + xDiff) < 8;
    }
    public void kick(Ball ball) {
        ball.setXYZ(ball.getX() + x, ball.getY() + y, ball.getZ() + z);
    }

}
