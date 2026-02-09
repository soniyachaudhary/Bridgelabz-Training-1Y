import java.util.Scanner;
class Number{
public static void main(String args[]){
System.out.println("enter any number");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
if(number>0){
System.out.println("positive number");
}
else if(number<0){
System.out.println("negative number");
}
else {
System.out.println("zero number");
}
}
}