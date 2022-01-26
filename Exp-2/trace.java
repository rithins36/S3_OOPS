import java.util.*;

public class trace {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[20][20], trace = 0;
        System.out.println("Enter the number of rows and colums of the matrices: ");
        int r = obj.nextInt();
        int c=obj.nextInt();

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = obj.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for(int j=0;j<c;j++){
                if(i==j){
                    trace += arr[i][j];
                }
            }
       }
        System.out.println("The trace of the matrix is " + trace);
        obj.close();
    }
}