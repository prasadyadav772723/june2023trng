
class D4Student{
int rollno;
String name;
D4Student(){rollno=0;name=null;}
D4Student(int r,String n){
rollno=r;
name=n;
}
void displayInformation(){
System.out.println(rollno+" "+name);
}
}
class D4TestStudent5{
public static void main(String args[]){
D4Student s1;
s1=new D4Student();
D4Student s2=new D4Student(526,"Santhosh");
s1.displayInformation();
s2.displayInformation();

}
}