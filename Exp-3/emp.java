import java.util.*;

public class emp {
    public static void main(String[] args) {
        employee e1 = new employee(), e2 = new employee(), e3 = new employee(), e4 = new employee(), e5 = new employee();
        
        System.out.println("Enter the details of employee 1");
        e1.read();
        e2.read();
        e3.read();
        e4.read();
        e5.read();

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}

class employee {
    int empno;
    String name, phone;

    Scanner sc = new Scanner(System.in);

    void read() {        
        System.out.print("Employee no: ");
        empno = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Phone: ");
        phone = sc.nextLine();

        System.out.print("\n");
    }

    void display() {
        System.out.println("\nEmployee no: " + this.empno);

        System.out.println("Name: " + this.name);

        System.out.println("Phone: " + this.phone + "\n");
    }
}