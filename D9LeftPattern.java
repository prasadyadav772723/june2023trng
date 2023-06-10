import java.util.Scanner;
class D9LeftPattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int n=sc.nextInt();
for (int i=0; i<n; i++)   
{        
for (int j=2*(n-i); j>=0; j--)         
{       
System.out.print(" ");   
}    
for (int j=0; j<=i; j++ )   
{         
System.out.print(s);   
}     
System.out.println();   
}   
}   
}





