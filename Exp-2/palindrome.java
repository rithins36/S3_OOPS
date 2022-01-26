import java.util.*;

public class palindrome {
    public static void main (String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = obj.nextLine(), rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (rev.equals(str)) {
            System.out.println(str + " is a palindrome");
        }
        else {
            if (rev.equals(str)) {
                System.out.println(str + " is not a palindrome");
            }
        }
    }
}
