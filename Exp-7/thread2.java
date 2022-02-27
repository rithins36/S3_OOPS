import java.util.*;
class odd extends Thread
{
 public void run()
 {
  for(int i=1;i<=100;i+=2)
  {
   System.out.print(i+",");
  }
 }
}
class even extends Thread
{
 public void run()
 {
  for(int i=2;i<=100;i+=2)
  {
   System.out.print(i+",");
  }
 }
}
class thread2
{
 public static void main(String args[])
 {
  odd t1 = new odd();
  even t2=new even();
  System.out.println("ODD NUMBERS:");
  t1.start();
  try{
  t1.join();
  System.out.println("\nEVEN NUMBERS:");
  t2.start();
  }
  catch(Exception e)
  {}
 }
}
/*
Output:
ODD NUMBERS:
1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59,61,63,65,67,69,71,73,75,77,79,81,83,85,87,89,91,93,95,97,99,
EVEN NUMBERS:
2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,62,64,66,68,70,72,74,76,78,80,82,84,86,88,90,92,94,96,98,100,
*/
