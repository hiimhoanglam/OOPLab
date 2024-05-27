package week10.strategy.sorting;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 10, 2, 4, 8, 0, 6};
        Context context = new Context();
        context.setSortingStrategy(new BubbleSortStrategy());
        context.executeStrategy(nums);
        context.setSortingStrategy(new InsertionSortStrategy());
        context.executeStrategy(nums);
        context.setSortingStrategy(new SelectionSortStrategy());
        context.executeStrategy(nums);

    }
}
