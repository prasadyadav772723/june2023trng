class Counter
{
static int count=0;
void Counter2()
{
count++;
System.out.println(count);
}
public static void main(String args[])
{
Counter c1=new Counter();
Counter c2=new Counter();
c1.Counter2();
c2.Counter2();
}
}