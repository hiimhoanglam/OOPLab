package week10.strategy.sorting;

import java.util.Arrays;

public class Context {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
    public void executeStrategy(int[] array) {
        sortingStrategy.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
