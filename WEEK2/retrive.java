package Day9.com;

import java.util.*;
public class retrive {
    public static void main(String args[]) {

        HashMap hm = new HashMap();
        hm.put("Clutch", 700);
        hm.put("wallet", 600);
        hm.put("Pouch",1200);
        System.out.println("Map = "+hm);

        System.out.println("\nKeys:");
        Set keys = hm.keySet();
        Iterator i = keys.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("\nValues:");
        Collection getValues = hm.values();
        i = getValues.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}