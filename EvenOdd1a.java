import java.util.*;
public class EvenOdd1a{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter a number: ");
n=sc.nextInt();
if(n/2*2==n)
System.out.println("Even\n");
else
System.out.println("Odd\n");
}
}