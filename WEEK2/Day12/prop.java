package Day12.com;
import java.util.*;
public class prop {
    public static void main(String[] args)
    {
        Properties properties = new Properties();

        properties.put(1, "100RS");
        properties.put(2, "500RS");
        properties.put(3, "1000RS");
        System.out.println("Available Properties: "
                + properties.toString());
        Enumeration enu = properties.elements();
        System.out.println("The enumeration of values are:");
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }
    }
}
