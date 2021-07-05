package Day12.com;
import java.util.*;
class hashiterate {
    public static void main(String[] args)
    {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Jin");
        ht.put(2, "Suga");
        ht.put(3, "RM");
        ht.put(4, "JHope");
        ht.put(5, "Jimin");
        ht.put(6, "V");
        ht.put(7, "JK");
        ht.forEach((key, value)
        -> System.out.println(
                "Rank: " + key
                        + "\t Name: " + value));
    }
}
