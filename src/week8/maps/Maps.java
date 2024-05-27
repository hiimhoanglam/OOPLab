package week8.maps;
import week6.composition.Point;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }
    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }
    public static boolean contains(Map<Integer,Integer> map, int key) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        return map.containsKey(key);
    }
    public static boolean containsKeyValue(Map<Integer, Integer> map,
                                           int key,
                                           int value) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        return map.containsKey(key) && map.containsValue(value);
    }
    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return map.keySet();
    }
    public static Collection<Integer> values(Map<Integer, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return map.values();
    }

    public static String getColor(int value) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "black");
        map.put(1, "white");
        map.put(2, "red");
        if (value < 0 || value > 2) {
            return "Invalid value";
        }
        return map.get(value);

    }

}
