package week8.sets;

import java.util.*;

public class SetsTest {
    public static void main(String[] args) {
        // Test intersectionManual
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        System.out.println("Intersection manual: " + Sets.intersectionManual(set1, set2)); // Should print [4, 5]

        // Test unionManual
        System.out.println("Union manual: " + Sets.unionManual(set1, set2)); // Should print [1, 2, 3, 4, 5, 6, 7, 8]

        // Test intersection
        System.out.println("Intersection: " + Sets.intersection(set1, set2)); // Should print [4, 5]

        // Test union
        System.out.println("Union: " + Sets.union(set1, set2)); // Should print [1, 2, 3, 4, 5, 6, 7, 8]

        // Test toList
        Set<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4, 5));
        System.out.println("To list: " + Sets.toList(set3)); // Should print [1, 2, 3, 4, 5]

        // Test removeDuplicates
        List<Integer> list1 = Arrays.asList(1, 2, 3, 3, 4, 5);
        System.out.println("Remove duplicates: " + Sets.removeDuplicates(list1)); // Should print [1, 2, 3, 4, 5]

        // Test removeDuplicatesManual
        System.out.println("Remove duplicates manual: " + Sets.removeDuplicatesManual(list1)); // Should print [1, 2, 3, 4, 5]

        // Test firstRecurringCharacter
        System.out.println("First recurring character: " + Sets.firstRecurringCharacter("abcdb")); // Should print "b"

        // Test allRecurringChars
        System.out.println("All recurring characters: " + Sets.allRecurringChars("abcdbcdeff")); // Should print [b, c, d, f]

        // Test toArray
        Set<Integer> set4 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("To array: " + Arrays.toString(Sets.toArray(set4))); // Should print [1, 2, 3, 4, 5]

        // Test getFirst
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("First element: " + Sets.getFirst(treeSet)); // Should print 1

        // Test getLast
        System.out.println("Last element: " + Sets.getLast(treeSet)); // Should print 5

        // Test getGreater
        System.out.println("Greater than 3: " + Sets.getGreater(treeSet, 3)); // Should print 4
        System.out.println("Greater than 5: " + Sets.getGreater(treeSet, 5)); // Should print -1
    }
}

