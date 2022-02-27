import java.util.*;
import java.io.*;
class fileexp
{
 public static void main(String args[])
 {
  System.out.println("Opening file..");
  try{
  FileInputStream f= new FileInputStream("test.txt");
  System.out.println("File opened");
  }
  catch(FileNotFoundException e)
  {
   System.out.println(e);
  } 
 }
}


/*
Output:
Opening file..
java.io.FileNotFoundException: test.txt (No such file or directory)
*/
