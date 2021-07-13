package Day19.com;
import java.util.Scanner;
class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{6,19}$";
}
public class usernamevalidation {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of usernames to checked");
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}