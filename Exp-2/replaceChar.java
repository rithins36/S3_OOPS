import java.util.*;

public class replaceChar {
    public static void main (String args[]) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = obj.nextLine();

        System.out.println("Enter the character to be replaced: ");
        int index = -1;
        char ch = obj.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Enter the character to replace: ");
        ch = obj.next().charAt(0);

        str = str.substring(0, index) + ch + str.substring(index + 1);

        System.out.println("The new string is: " + str);
       
    }
}
