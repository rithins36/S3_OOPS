import java.util.*;
abstract class shape
{
 abstract void numberOfSides();
}
class rectangle extends shape
{
 void numberOfSides()
 {
  System.out.println("Rectangle:\nNo.of sides: 4");
 }
}
class triangle extends shape
{
 void numberOfSides()
 {
  System.out.println("Triangle:\nNo.of sides: 3");
 }
}
class hexagon extends shape
{
 void numberOfSides()
 {
  System.out.println("Hexagon:\nNo.of sides: 6");
 }
}
class shapes
{
 public static void main(String args[])
 {
  rectangle r = new rectangle();
  triangle t = new triangle();
  hexagon h = new hexagon();
  r.numberOfSides();
  t.numberOfSides();
  h.numberOfSides();
 }
}
/*
 Output:
 
Rectangle:
No.of sides: 4
Triangle:
No.of sides: 3
Hexagon:
No.of sides: 6
 */
