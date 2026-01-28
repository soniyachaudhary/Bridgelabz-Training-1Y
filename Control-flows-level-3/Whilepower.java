import java.util.*;
public class bmiimport java.util.*;
public class Whilepower{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int result=1;
int i=1;
if(n>0){
if(m>0){
while(i<=m){
result=result*n;
i++;
}
}
}
System.out.println("the power of a number is="+result);
}
}{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter weight in kgs ");
double weight=sc.nextDouble();
System.out.println("enter height in cms");
double height=sc.nextDouble();
double heightm=height/100;
double bmi=weight/(heightm*heightm);
if(bmi<=18.4){
System.out.println("underweight");
}
else if(bmi>=18.5&&bmi<=24.9){
System.out.println("normal");
}
else if(bmi>=25.0&&bmi<=39.9){
System.out.println("overweight");
}
else{
System.out.println("obese");
}
}
}

