import java.util.Scanner;
class IntOperation
{
   public static void main(String args[])
   {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a:-");
   int a = sc.nextInt();
   System.out.println("Enter b:-");
   int b = sc.nextInt();
   System.out.println("Enter c:-");
   int c = sc.nextInt();
   int op1 = a+(b*c);
   int op2 = (a*b)+c;
   int op3 = c+(a/b);
   int op4 = (a%b)+c;
   System.out.println("Result of Int Operations are:-");
   System.out.println("a+(b*c):-"+op1);
   System.out.println("(a*b)+c:-"+op2);
   System.out.println("c+(a/b):-"+op3);
   System.out.println("(a%b)+c:-"+op4);
   }
   }