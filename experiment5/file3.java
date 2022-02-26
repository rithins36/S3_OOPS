import java.io.*;
import java.util.*;
class file3
{
 public static void main(String args[])
 {
  try
  {
   FileWriter fw=new FileWriter("/home/s3d1/s3d43/file3.txt");
   FileReader fr=new FileReader("/home/s3d1/s3d43/file3.txt");      
   fw.write("Name:Rahul V Pillai\n");
   fw.write("Address:Palackal House\n");
   fw.close();
   int i;
   while((i=fr.read())!=-1)
   {
    System.out.print((char)i); 
   }
   fr.close();
  }
  catch(Exception e)
  {System.out.println("Exception occured");}
 }
}