package week10.adapter.pseudocode;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return (peg.getWidth() * Math.sqrt(2)) / 2;
    }
}
