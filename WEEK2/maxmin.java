package Day9.com;

import java.util.*;
public class maxmin {
    public static void main(String args[]) throws Exception {


        Map<String, Integer> map
                = new HashMap<String, Integer>();


        map.put("A", 10);
        map.put("B", 15);
        map.put("C", 20);
        map.put("D", 25);


        System.out.println("Map: " + map);

        String minKey = Collections.min(map.keySet());

        String maxKey = Collections.max(map.keySet());

        System.out.println("Minimum Key of Map is: "
                + minKey);
        System.out.println("Value corresponding to "
                + "minimum Key of Map is: "
                + map.get(minKey));

        System.out.println("Maximum Key of Map is: " + maxKey);
        System.out.println("Value corresponding to "
                + "maximum Key of Map is: "
                + map.get(maxKey));
    }
}