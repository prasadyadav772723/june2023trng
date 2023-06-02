import java.util.Scanner;
class Swap1{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number:");
int a,b;
a=scob.nextInt();
b=scob.nextInt();
int temp;
temp=a;
a=b;
b=temp;
System.out.println(a+"\n"+b);


}
}
