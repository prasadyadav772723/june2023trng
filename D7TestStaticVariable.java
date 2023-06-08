class Student{
int rollno;
String name;
static String college="MTIE";
Student(int r,String n){
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class D7TestStaticVariable{
public static void main(String args[]){
Student s1=new Student(537,"Prasad");
Student s2=new Student(526,"Santha");
Student.college="MTIEAT";
s1.display();
s2.display();
}
}
