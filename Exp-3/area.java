class area
{
    public static void main(String args[])
    {
        area obj=new area();
        obj.a(5);
        obj.a(4,5);
        obj.a(4.5,5.5);
    }
    void a(int a)
    {
        System.out.println("Area of circle is:"+(3.14*a*a));
    }
    void a(int n,int m)
    {
        System.out.println("Area of Rectangle is:"+(n*m));
    }
    void a(double c,double d)
    {
        System.out.println("Area of triangle is:"+(0.5*c*d));
    }
}