import java.util.Scanner;
class Volume
{
 public static void main(String args[])
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter radius:");
     Double r = sc.nextDouble();
	 System.out.println("Enter height:");
     Double h = sc.nextDouble();
      Double Volume = 3.14 * r * r * h;
     System.out.println("Volume is: " +Volume);
	 }
}