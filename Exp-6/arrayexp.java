import java.util.*;
class arrayexp
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  int i;
  int[] a= new int[3];
  System.out.println("Enter values in array:");
  try{
   for(i=0;i<=3;i++)
   {
    a[i]=obj.nextInt();
   }
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
   System.out.println(e);
  }
  finally
  {
   System.out.println("Elements in array are:");
   for(i=0;i<3;i++)
   {
    System.out.println(a[i]);
   }
  }
 }
}

/*
Output:
Enter values in array:
1
5
9
4
java.lang.ArrayIndexOutOfBoundsException: 3
Elements in array are:
1
5
9
*/
