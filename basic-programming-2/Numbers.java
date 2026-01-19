import java.util.Scanner;
class Numbers
{
   public static void main(String args[])
   {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a:-");
   int a = sc.nextInt();
   System.out.println("Enter b:-");
   int b = sc.nextInt();
   Float division = (float) a/b;
   int modulus = a%b;
   System.out.println("Find division:-"+division);
   System.out.println("Find modulus:-"+modulus);
   }
   }