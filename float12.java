import java.util.Scanner;
class float12
{
public static void main(String[] args)
{
float num1;
float num2;
Scanner Sc=new Scanner(System.in);
System.out.print("Enter the number1:");
num1=Sc.nextFloat();
System.out.print("Enter the number2:");
num2=Sc.nextFloat();
num1=Math.round(num1*1000);
num1=num1/1000;
num2=Math.round(num2*1000);
num2=num2/1000;
if(num1==num2)
{
System.out.print("number are equal till three decimal values");
}
else
{
System.out.print("number are not equal");
}
}
}

