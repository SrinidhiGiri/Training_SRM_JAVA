package Day8.com;
import java.util.*;
public class JoinList{
    public static void main(String[] args) {
        LinkedList <String> l1 = new LinkedList <String> ();
        l1.add("Apple");
        l1.add("GreenApple");
        l1.add("Pineapple");
        l1.add("Custard Apple");
        l1.add("Cashew Apple");
        System.out.println("List of first linked list: " + l1);
        LinkedList <String> l2 = new LinkedList <String> ();
        l2.add("Strawberry");
        l2.add("Mulberry");
        l2.add("Blueberry");
        l2.add("Cranberry");
        l2.add("Blackberry");
        System.out.println("List of second linked list: " + l2);
        LinkedList <String> a = new LinkedList <String> ();
        a.addAll(l1);
        a.addAll(l2);
        System.out.println("New linked list: " + a);
    }
}