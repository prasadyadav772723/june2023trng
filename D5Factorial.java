import java.util.Scanner;
class D5Factorial{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
int fact=1;
System.out.println("Enter any positive integer:");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
fact*=i;
}
System.out.println("factorialof "+n+" is "+fact);
}
}