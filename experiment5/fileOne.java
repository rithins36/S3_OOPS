import java.io.*;
class fileOne
{
 public static void main(String args[])
 {
  try
  {
    FileReader f1= new FileReader("Hi.txt");
    BufferedReader b1=new BufferedReader(f1);
    int i=0;
    int j=1;
    String s =b1.readLine();
    while(s!=null)
    {
      System.out.print(j+". ");
      System.out.print(s); 
      s=b1.readLine();
      System.out.println();
      j++;
    }
  }
  catch(Exception e)
  {}
 }
}



/*
Output:
1. Hi all,
2. Welcome to the world of programming
3. let us start.
*/