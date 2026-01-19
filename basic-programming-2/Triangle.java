import java.util.Scanner;
class Triangle
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter area in Cm:");
 double Area_Cm = sc.nextDouble();
 double Area_inch = Area_Cm / (2.54*2.54);
 System.out.println("area of triangle in Cm = "+ Area_Cm);
 System.out.println("area of triangle in inch:-"+ Area_inch);
 }
 }