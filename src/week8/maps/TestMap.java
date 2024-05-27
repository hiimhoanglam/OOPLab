package week8.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, Integer> testMap1 = new HashMap<>();
        testMap1.put(1, 10);
        testMap1.put(2, 20);
        testMap1.put(3, 30);
        System.out.println("Count: " + Maps.count(testMap1)); // Should print 3

        // Test empty
        Maps.empty(testMap1);
        System.out.println("After empty: " + testMap1); // Should print {}

        // Test contains
        Map<Integer, Integer> testMap2 = new HashMap<>();
        testMap2.put(1, 100);
        testMap2.put(2, 200);
        testMap2.put(3, 300);
        System.out.println("Contains key 2: " + Maps.contains(testMap2, 2)); // Should print true
        System.out.println("Contains key 5: " + Maps.contains(testMap2, 5)); // Should print false

        // Test containsKeyValue
        System.out.println("Contains key-value pair (2, 200): " + Maps.containsKeyValue(testMap2, 2, 200)); // Should print true
        System.out.println("Contains key-value pair (3, 100): " + Maps.containsKeyValue(testMap2, 3, 100)); // Should print false

        // Test keySet
        Set<Integer> keySet = Maps.keySet(testMap2);
        System.out.println("Key set: " + keySet); // Should print [1, 2, 3]

        // Test values
        Collection<Integer> values = Maps.values(testMap2);
        System.out.println("Values: " + values); // Should print [100, 200, 300]

        // Test getColor
        System.out.println("Color for value 1: " + Maps.getColor(1)); // Should print "white"
        System.out.println("Color for value 2: " + Maps.getColor(2)); // Should print "read"
        System.out.println("Color for value -1: " + Maps.getColor(-1)); // Should print "Invalid value"
    }
}
