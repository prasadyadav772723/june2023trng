import java.util.*;
class AgeDoesNotFitException extends Exception{
String msg;
AgeDoesNotFitException(String msg){
super(msg);
this.msg=msg;
}
public String toString(){
return msg;
}
}
class D13Main2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int marks=sc.nextInt();
try{
if(marks<35){
throw new AgeDoesNotFitException("you failed in the exam");
}
else
{
System.out.println("you passed  the exam");
}
}
catch(AgeDoesNotFitException ex){
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}