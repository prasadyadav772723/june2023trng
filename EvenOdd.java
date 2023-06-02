import java.util.*;
public class EvenOdd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter a number:");
n=sc.nextInt(); 
if(n%2==0){
System.out.println("Even\n");
System.out.println(n+"is Even\n");
}
else{
System.out.println("Odd\n");
System.out.println(n+"is Odd\n");
}
}
}

