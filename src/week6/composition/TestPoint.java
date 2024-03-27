package week6.composition;

import java.util.Random;

public class TestPoint {
    public static void main(String[] args) {
        Random random = new Random(100);
        for (int i = 0; i < 5; i++) {
            System.out.println(new Point(random.nextInt(), random.nextInt()));
        }
    }
}
