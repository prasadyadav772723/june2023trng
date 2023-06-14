class TestInterruptingThread2 extends Thread{
public void run(){
try{
Thread.sleep(1000);
System.out.println("task");
}
catch(InterruptedException e){
throw new RuntimeException("Exception handled..."+e);}
System.out.println("threadis running");

}
public static void main(String args[]){
TestInterruptingThread2 t2=new TestInterruptingThread2();
t2.start();
t2.interrupt();
}
}