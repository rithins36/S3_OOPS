import java.util.*;
class funs
{
	public static void main(String args[])
	{
        funs1 obj=new funs1();
        obj.rev();
        obj.freq();
    }
}
class funs1
{
    void rev()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=obj.nextLine();
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed string is:"+rev);
    }
    void freq()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=obj.nextLine();
        System.out.println("Enter the character to be checked: ");
        char a=obj.next().charAt(0);
        int len=str.length();
        int frequency=0;
        for(int i=0;i<len;i++)
        {
            if(a==str.charAt(i)){
                System.out.println("The character is present at position "+(i+1));
                frequency++ ;   } 
        }
        System.out.println("Frequency of character is "+frequency) ;
    }
}
