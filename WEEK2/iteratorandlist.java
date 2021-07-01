package Day9.com;

import java.util.*;
public class iteratorandlist {
    public static void main(String[] args) {
        List<String> listObject = new ArrayList<String>();
        listObject.add("Welcome");
        listObject.add("to");
        listObject.add("Java");
        listObject.add("Training");
        Iterator it = listObject.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}


//import java.util.*;
//public class iteratorandlist {
//   public static void main(String[] args) {
//      List<String> listObject = new ArrayList<String>();
//      listObject.add("Welcome");
//      listObject.add("to");
//      listObject.add("JAVA");
//      listObject.add("Training");
//      ListIterator it = listObject.listIterator();
//      System.out.println("Forward direction: ");
//      while (it.hasNext()) {
//         System.out.println(it.next());
//      }
//      System.out.println("--------------------------------------------");
//      System.out.println("Backward direction: ");
//      while (it.hasPrevious()) {
//         System.out.println(it.previous());
//      }
//   }
//}
