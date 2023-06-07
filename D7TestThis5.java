class Student{
int rollno;
String name,course;
float fee;
Student(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
Student(int rollno,String name,String course,float fee){
this(rollno,name,course);
this.fee=fee;
}
void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class D7TestThis5{
public static void main(String args[]){
Student s1=new Student(537,"prasad","PM");
Student s2=new Student(526,"Santhosh","Santha",6000f);
s1.display();
s2.display();
}
}