import java.util.*;

public class frequency {
    public static void main (String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = obj.nextLine();

        System.out.println("Enter a character to count the frequency: ");
        char ch = obj.next().charAt(0);

        int count = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ch) {
                count += 1;
            }
        }

        System.out.println("frequency of " + ch + " in " + str + " is " + count);
    }
}
