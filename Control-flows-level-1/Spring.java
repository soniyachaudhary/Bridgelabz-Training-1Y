import java.util.Scanner;
class Spring
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter date of month");
int d=sc.nextInt();
System.out.println("Enter the month");
int m=sc.nextInt();
if(m==3 && d>=20 && d<=31){
System.out.println("its a spring season");
}
else if(m==4 && d>=1 && d<=30){
System.out.println("its a spring season");
}
else if(m==5 && d>=1 && d<=31){
System.out.println("its a spring season");
}
else if(m==6 && d>=1 && d<=30){
System.out.println("its a spring season");
}
else{
System.out.println("its not a spring season");
}
}
}
