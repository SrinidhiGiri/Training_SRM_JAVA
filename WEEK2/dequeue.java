package Day9.com;
import java.util.ArrayDeque;

public class dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top  element of the stack: " + stack.peek());


        System.out.println("Popped element from the stack: " + stack.pop());

        System.out.print("Current elements in the stack: ");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
