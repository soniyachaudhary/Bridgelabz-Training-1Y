import java.util.Scanner;
class Price
{
	 public static void main(String args[])
	 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Quantity:-");
	 int Quantity = sc.nextInt();
	 System.out.println("Enter Price:-");
	 int Price = sc.nextInt();
	 int Total_Price = Quantity*Price;
	 System.out.println("Total Price :-" + Total_Price);
	 }
}

	 