class Student{
int rollno;
String name;
float fee;
Student (int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display(){System.out.println(rollno+" "+name+" "+fee);}
}
class D7TestThis{
public static void main(String args[]){
Student s1=new Student(537,"Prasad",5000f);
Student s2=new Student(526,"Santha",5000f);
s1.display();
s2.display();
}
}