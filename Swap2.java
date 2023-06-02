import java.util.Scanner;
class Swap2{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number:");
int a,b;
a=scob.nextInt();
b=scob.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println(a+"\n"+b);
}
}
