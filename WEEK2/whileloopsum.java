package Day8.com;
import java.util.*;
public class whileloopsum {
    public static void main(String args[])
    {
        List<Integer> TreeSet = new ArrayList<Integer>();
        int sum = 0;
        int count = 0;
        TreeSet.add(1);
        TreeSet.add(2);
        TreeSet.add(3);
        TreeSet.add(4);
        TreeSet.add(5);
        while (TreeSet.size() > count) {
            sum += TreeSet.get(count);
            count++;
        }
        System.out.println(" The sum of the elements using while loop = " + sum);
    }
}
