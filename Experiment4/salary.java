import java.util.*;
class employee
{
 void display() 
 {
  System.out.println("Name of class is Employee.");
 }
 void calcSalary()
 {
  System.out.println("Salary of employee is 10000");
 }
}
class engineer extends employee
{
 void display() 
 {
  super.display();
  super.calcSalary();
  System.out.println("Name of class is Engineer.");
 }
 void calcSalary()
 {
  System.out.println("Salary of employee is 20000");
 }
}
class salary
{
 public static void main(String args[])
 {
  engineer eg = new engineer();
  eg.display();
  eg.calcSalary();
 }
}



/*
Output:
Name of class is Employee.
Salary of employee is 10000
Name of class is Engineer.
Salary of employee is 20000
*/
