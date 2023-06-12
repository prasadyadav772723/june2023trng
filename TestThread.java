class TestThread extends Thread{
public static void main(String args[]){
TestThread t=new TestThread();
t.start();
System.out.println("This is out side of thread");
}
public void run(){
System.out.println("This is running in a thread");
}
}