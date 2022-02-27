import java.util.*;
import java.lang.*;
public class garbage
{
 
 public static void main(String args[])
 {
  garbage ob1 = new garbage();
  garbage ob2 = new garbage();
  garbage ob3 = new garbage();
  ob1=ob2;
  ob3=null;
  System.gc();
 }

 public void finalize()
 {
  System.out.println("Garbage collected....");
 }
}


/*
Output:
Garbage collected....
Garbage collected....
*/
