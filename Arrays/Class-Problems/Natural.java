import java.util.Scanner;
class Natural{
public static void main(String args[]){
System.out.println("enter any number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum =  n*(n+1)/2;
System.out.println("sum of natural numbers="+sum);
}
}