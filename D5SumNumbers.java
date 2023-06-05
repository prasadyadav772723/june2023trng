import java.util.Scanner;
public class D5SumNumbers{
public static void main(String args[]){
int sum=0;
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

for(int i=1;i<=n;i++)
{
sum+=i;
}
System.out.println("Sum:"+sum);
}
}