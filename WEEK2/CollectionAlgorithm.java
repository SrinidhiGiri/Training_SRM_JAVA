package Day10.com;
import java.util.ArrayList;
import java.util.Collections;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        System.out.println("Unsorted ArrayList: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);
        System.out.println("ArrayList before shuffling: " + numbers);
        Collections.shuffle(numbers);
        System.out.println("ArrayList after shuffling: " + numbers);
        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);
        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);
    }
}