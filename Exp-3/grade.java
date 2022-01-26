import java.util.*;

 class grade
{
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        String n = obj.nextLine();
        System.out.print("Enter class of student: ");
        int c = obj.nextInt();
        System.out.print("Enter roll no of student: ");
        int r = obj.nextInt();
        System.out.print("Enter marks in 1st subject: ");
        int m1 = obj.nextInt();
        System.out.print("Enter marks in 2nd subject: ");
        int m2 = obj.nextInt();
        System.out.print("Enter marks in 3rd subject: ");
        int m3 = obj.nextInt();
        System.out.print("Enter marks in 4th subject: ");
        int m4 = obj.nextInt();
        System.out.print("Enter marks in 5th subject: ");
        int m5 = obj.nextInt();
        int t = m1 + m2 + m3 + m4 + m5;
        double p = t / 500.0 * 100.0;
        String g;
        if (p >= 90)
            g = "A+";
        else if (p >= 80)
            g = "A";
        else if (p >=70)
            g = "B+";
        else if (p >= 60)
            g = "B";
        else if (p >= 50)
            g = "C";
        else if (p >= 40)
            g = "D";
        else
            g = "E";
            
        System.out.println("Total Marks = " + t);
        System.out.println("Percentage = " + p);
        System.out.println("Grade = " + g);
    }
}