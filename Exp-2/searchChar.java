import java.util.*;

public class searchChar {
    public static void main (String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = obj.nextLine();

        System.out.println("Enter a character to search: ");
        char ch = obj.next().charAt(0);

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ch) {
                System.out.println(ch + " is at " + i + "th index of str");
                return;
            }
        }

        System.out.println(ch + " not found in " + str);
        
    }
}
