package Day8.com;
import java.util.*;
import java.io.*;
class forloopsum {
    public static void main(String[] args)
    {
        List<Integer> TreeSet = new ArrayList<>();
        TreeSet.add(1);
        TreeSet.add(2);
        TreeSet.add(3);
        TreeSet.add(4);
        TreeSet.add(5);
        int sum = 0;
        for (int i = 0; i < TreeSet.size(); i++)
            sum += TreeSet.get(i);

        System.out.println("Sum of the elements using for loop =  " + sum);
    }
}
