import java.io.*;
class file2
{
 public static void main(String args[])
 {
  try
  {
   FileReader f1=new FileReader("/home/s3d1/s3d43/hello.txt");
   BufferedReader b=new BufferedReader (f1);
   int l=0,w=0,c=0;
   String s=b.readLine();
   while(s!=null)
   {
    l++;//line count
    String[] word=s.split(" ");
    w=w+word.length;////finding word count
    for(String i:word)
    {
     c=c+i.length();//finding character count
    }
    s=b.readLine();
   }
   System.out.println("Number of characters :"+c); 
   System.out.println("Number of lines:"+l); 
   System.out.println("Number of words :"+w); 
  }
  catch(Exception e)
  {System.out.println("Exception occured");}
 }
}



/*
Output:
Number of characters :51
Number of lines:3
Number of words :10
*/