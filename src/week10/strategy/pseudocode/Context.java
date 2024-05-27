package week10.strategy.pseudocode;

public class Context {
    private MathStrategy strategy;

    public MathStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(MathStrategy strategy) {
        this.strategy = strategy;
    }
    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
