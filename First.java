class First
{
public static void main(String args[])throws Exception
{
Thread t=new Thread();
System.out.println("CURRENTTHREAD="+t);
t.setName("new thread by seen");
t.setPriority(t.getPriority()-1);
System.out.println("currentthread:"+t);
System.out.println("name="+t.getName());
}
}