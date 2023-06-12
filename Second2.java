class First3 implements Runnable

{
Thread t; String S;
First3(String Name)
{
S=Name;
t=new Thread(this,S);
System.out.println("child: "+t);
t.start();
}
public void run()
{
try
{
for(int i=5;i>0;i--)
{
System.out.println(S+""+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{}
System.out.println("exiting" +S);
}
}
class Second2
{
public static void main(String args[])
{
new First3("ONE");
new First3("TWO");
new First3("THREE");
try
{Thread.sleep(20000);
for(int i=5;i>0;i--)
{
System.out.println("MAIN "+i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
}
System.out.println("exiting main");
}
}