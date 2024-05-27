package week8.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        // Test insertFirst
        List<Integer> testList1 = new ArrayList<>();
        Lists.insertFirst(testList1, 10);
        System.out.println("After insertFirst: " + testList1); // Should print [10]

        // Test insertLast
        List<Integer> testList2 = new ArrayList<>();
        Lists.insertLast(testList2, 20);
        System.out.println("After insertLast: " + testList2); // Should print [20]

        // Test removeThird
        List<Integer> testList3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Lists.removeThird(testList3);
        System.out.println("After removeThird: " + testList3); // Should print [1, 2, 4, 5]

        // Test removeEvil
        List<Integer> testList4 = new ArrayList<>(Arrays.asList(666, 2, 3, 666));
        Lists.removeEvil(testList4);
        System.out.println("After removeEvil: " + testList4); // Should print [2, 3]

        // Test generateSquare
        List<Integer> testList5 = Lists.generateSquare();
        System.out.println("Generated square: " + testList5); // Should print [1, 4, 9, 16, 25, 36, 49, 64, 81]

        // Test contains
        List<Integer> testList6 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        System.out.println("Contains 20: " + Lists.contains(testList6, 20)); // Should print true
        System.out.println("Contains 50: " + Lists.contains(testList6, 50)); // Should print false

        // Test copy
        List<Integer> testList7 = new ArrayList<>();
        Lists.copy(testList6, testList7);
        System.out.println("After copy: " + testList7); // Should print [10, 20, 30, 40]

        // Test reverse
        List<Integer> testList8 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Lists.reverse(testList8);
        System.out.println("After reverse: " + testList8); // Should print [5, 4, 3, 2, 1]

        // Test reverseManual
        List<Integer> testList9 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Lists.reverseManual(testList9);
        System.out.println("After reverseManual: " + testList9); // Should print [5, 4, 3, 2, 1]

        // Test insertBeginningEnd
        LinkedList<Integer> testList10 = new LinkedList<>();
        Lists.insertBeginningEnd(testList10, 50);
        System.out.println("After insertBeginningEnd: " + testList10); // Should print [50, 50]
    }
}
