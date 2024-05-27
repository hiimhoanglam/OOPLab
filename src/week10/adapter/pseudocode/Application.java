package week10.adapter;

public class Application {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println("Round Hole with radius = 5");
        System.out.println("Does Round Peg with radius 5 fits this hole");
        System.out.println(hole.fits(roundPeg));
        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);
        //hole.fits(small_sqpeg) => error because a square peg is not a round peg
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        System.out.println("Does Square Peg with width 5 fits this hole");
        System.out.println(hole.fits(smallSquarePegAdapter));
        System.out.println("Does Square Peg with width 10 fits this hole");
        System.out.println(hole.fits(largeSquarePegAdapter));
    }
}
