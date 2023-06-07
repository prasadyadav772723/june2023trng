class D7Student{
int id;
String name;
int age;
D7Student(int i,String n){
id=i;
name=n;
}
D7Student(int i,String n,int a){
id=i;
name=n;
age=a;
}
void display(){System.out.println(id+" "+name+" "+age);}
public static void main(String[] args){
D7Student s1=new D7Student(537,"Prasad");
D7Student s2=new D7Student(526,"Santhosh",39);
s1.display();
s2.display();

}
}

