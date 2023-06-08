class D8Testouter{
static int data=30;
static class Inner{
void msg()
{
System.out.println("data is "+data);
}
}
public static void main(String args[])
{
D8Testouter.Inner obj=new D8Testouter.Inner();
obj.msg();
}
}