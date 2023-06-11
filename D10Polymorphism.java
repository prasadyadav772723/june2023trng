import java.util.Scanner;
class D10Polymorphism{
void print(){System.out.println("welcome");}
void print(String n){System.out.println("Welcome "+n);}
}
class Test{
public static void main(String args[]){
D10Polymorphism obj=new D10Polymorphism();
obj.print();
Scanner sc=new Scanner(System.in);
System.out.print("please enter your name: ");
String s=sc.next();
obj.print(s);
}
}
