class A{
A(){System.out.println("Hello a");}
A(int x){
this();
System.out.println(x);
}
}
class D7TestThis3{
public static void main(String args[]){
A a=new A(10);
}
}