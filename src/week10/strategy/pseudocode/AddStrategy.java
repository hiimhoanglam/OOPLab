package week10.strategy.pseudocode;

public class AddStrategy implements MathStrategy{
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
