package week8.lists;
import java.util.*;
public class Lists {
    public static void insertFirst(List<Integer> list, int value) {
        if (list == null) {
            return;
        }
        list.add(0,value);
    }
    public static void insertLast(List<Integer> list, int value) {
        if (list == null) {
            return;
        }
        list.add(value);
    }
    public static void removeThird(List<Integer> list) {
        if (list == null || list.size() < 3) {
            return;
        }
        list.remove(2);
    }
    public static void removeEvil(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return;
        }

        list.removeAll(Collections.singleton(666));
    }
    public static List<Integer> generateSquare() {
        List<Integer> square = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            insertLast(square, (i+1) * (i+1));
        }
        return square;
    }
    public static boolean contains(List<Integer> list, int value) {
        if (list == null || list.isEmpty()) {
            System.out.println("Invalid list");
            return false;
        }
        return list.contains(value);
    }
    public static void copy(List<Integer> source, List<Integer> target) {
        if (source == null || target == null || source.isEmpty()) {
            return;
        }
        target.clear();
        for (Integer integer : source) {
            insertLast(target, integer);
        }
    }
    public static void reverse(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Collections.reverse(list);
    }
    public static void reverseManual(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(0);
            list.set(0, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
    }
    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        if (list == null) {
            return;
        }
        list.addFirst(value);
        list.addLast(value);
    }
}
