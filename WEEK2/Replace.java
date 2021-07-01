package Day8.com;
import java.util.ArrayList;
public class Replace {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Grapes");
        list.add("Orange");
        System.out.println(list);
        list.set(3, "Pineapple");
        System.out.println(list);
    }
}
// add() for adding the element
// using set() setting the element to be changed
// 2 is the index of the second element