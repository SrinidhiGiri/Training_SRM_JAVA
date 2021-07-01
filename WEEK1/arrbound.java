package Training.com;

public class arrbound {
    public static void main(String[] args) {
        try {
            int[] a = new int[999];
            System.out.println("Access element one lakh :" + a[100000]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
            System.out.println("Out of the block");
        }

    }
}
