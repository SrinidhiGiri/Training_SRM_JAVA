package Day12.com;
import java.util.Arrays;
import java.util.TreeSet;
public class duplicate {
    public static void main(String a[]){
        String[] strArr = {"one","two","three","four","four","five"};
        System.out.println("Original Entries are: " + Arrays.toString(strArr));
        TreeSet<String> unique = new TreeSet<String>();
        for(String str:strArr){
            if(!unique.add(str)){
                System.out.println("Duplicate Entry is: "+str);
            }
        }
    }
}
