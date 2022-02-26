import java.util.*;
class sq extends Thread
{
 int x;
 sq(int x)
 {
  this.x=x;
 }
 public void run()
 {
  System.out.println("Thread-2:Square of "+x+" is "+(x*x));
 }
}
class cu extends Thread
{
 int x;
 cu(int x)
 {
  this.x=x;
 }
 public void run()
 {
  System.out.println("Thread-3:Cube of "+x+" is "+(x*x*x));
 }
}

class thread1 extends Thread
{
 public void run()
 {
  	Random r = new Random();
  	for(int i=0;i<5;i++)
  	{
  	int a = r.nextInt(100); 
  	System.out.println("Thread-1:Random integer generated is "+a);
  	if(a%2==0)
  	{
   		sq t2 = new sq(a);
   		t2.start();
   		
  	}	
  	else
  	{
   		cu t3 = new cu(a);
   		t3.start();
   		
  	}
  	try
  	{
  		Thread.sleep(100);
  	}
  	catch(Exception e)
  	{}
  	}
 }
 public static void main(String args[])
 {
  
  	thread1 t1 = new thread1();
  	t1.start();
 }
}
/*
Output
Thread-1:Random integer generated is 26
Thread-2:Square of 26 is 676
Thread-1:Random integer generated is 59
Thread-3:Cube of 59 is 205379
Thread-1:Random integer generated is 81
Thread-3:Cube of 81 is 531441
Thread-1:Random integer generated is 71
Thread-3:Cube of 71 is 357911
Thread-1:Random integer generated is 76
Thread-2:Square of 76 is 5776
*/
