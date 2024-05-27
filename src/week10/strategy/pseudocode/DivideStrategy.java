package week10.strategy.pseudocode;

public class DivideStrategy implements MathStrategy{
    @Override
    public int execute(int a, int b) {
        return a / b;
    }
}
