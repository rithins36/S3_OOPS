import java.util.*;
class shapes
{
    public static void main(String args[])
    {
        shapes obj=new shapes(5);
        shapes obj1=new shapes(5,4);
    }
    shapes(int a)
    {
        System.out.println("Perimeter of circle is:"+(3.14*2*a));
    }
    shapes(int n,int m)
    {
        int p=n+m;
        int t=2*p;
        System.out.println("Perimeter  of Rectangle is:"+t);
    }
} 