import java.io.*;
import java.util.*;
class file4
{
 	public static void main (String args[])
 	{
         	try{
 		FileInputStream fin=new FileInputStream("number.txt");    
  		int i=0,sum=0;
  		System.out.println("Numbers are:");
  		while((i=fin.read())!=-1)
  		{
  			String s = Character.toString((char)i);
  			StringTokenizer t = new StringTokenizer(s);
  			while(t.hasMoreTokens())
  			{
                        	s=t.nextToken();
  				System.out.println(s);
  				int a=Integer.parseInt(s);
				sum=sum+a;
  			}
		}
		System.out.println("Sum = "+sum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	 }
}


/*
Output:
Numbers are:
2
1
8
2
2
9
2
2
Sum = 28
*/