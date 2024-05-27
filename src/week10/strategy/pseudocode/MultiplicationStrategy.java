package week10.strategy.pseudocode;

public class MultiplicationStrategy implements MathStrategy{
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
