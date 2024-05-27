package week8.sets;
import java.util.*;
public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first,
                                                  Set<Integer> second) {
        if (first == null || second == null) {
            return null;
        }
        Set<Integer> result = new HashSet<>();
        for (int element: first) {
            if (second.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }
    public static Set<Integer> unionManual(Set<Integer> first,
                                           Set<Integer> second) {
        if (first == null || second == null) {
            return null;
        }
        Set<Integer> result = new HashSet<>();
        for (int element: first) {
            result.add(element);
        }
        for (int element: second) {
            result.add(element);
        }
        return result;
    }
    public static Set<Integer> intersection(Set<Integer> first,
                                           Set<Integer> second) {
        if (first == null || second == null) {
            return null;
        }
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }
    public static Set<Integer> union(Set<Integer> first,
                                            Set<Integer> second) {
        if (first == null || second == null) {
            return null;
        }
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }
    public static List<Integer> toList(Set<Integer> source) {
        if (source == null || source.isEmpty()) {
            return null;
        }
        return new ArrayList<>(source);
//        return source.stream().toList();
    }
    public static List<Integer> removeDuplicates(List<Integer> source) {
        if (source == null) {
            return null;
        }
        Set<Integer> result = new HashSet<>(source);
        return new ArrayList<>(result);
    }
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        if (source == null) {
            return null;
        }
        Set<Integer> result = new HashSet<>();
        result.addAll(source);
        List<Integer> resultList = new ArrayList<>();
        resultList.addAll(result);
        return resultList;
    }
    public static String firstRecurringCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return Character.toString(s.charAt(i));
            }
            set.add(s.charAt(i));
        }
        return null;
    }
    public static Set<Character> allRecurringChars(String s) {
        Set<Character> result = new HashSet<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                result.add(s.charAt(i));
            }
            else {
                set.add(s.charAt(i));
            }
        }
        return result;
    }
    public static Integer[] toArray(Set<Integer> source) {
        if (source == null || source.contains(null)) {
            return null;
        }
        return source.toArray(new Integer[0]);
    }
    public static int getFirst(TreeSet<Integer> source) {
        if (source == null) {
            return -1;
        }
        return source.first();
    }
    public static int getLast(TreeSet<Integer> source) {
        if (source == null) {
            return -1;
        }
        return source.last();
    }
    public static Integer getGreater(TreeSet<Integer> source, int value) {
        if (source == null || source.isEmpty()) {
            return -1;
        }
        if (source.higher(value) != null) {
            return source.higher(value);
        }
        return -1;
    }
}
