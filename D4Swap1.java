import java.util.Scanner;
class D4Swap1{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);

int a,b;
a=scob.nextInt();
b=scob.nextInt();
int temp;
temp=a;
a=b;
b=temp;
System.out.print(a+" "+b);


}
}
