import java.util.Scanner;
class D9LeftPattern2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int n=sc.nextInt();
for (int i= 0; i<= n; i++)  
{    
for (int j=1; j<=n-i; j++)  
{  
System.out.print(" ");  
}  
for (int k=0;k<=i;k++)  
{  
System.out.print(s);  
}   
System.out.println("");  
}  
}  
}  









