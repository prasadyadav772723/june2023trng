class D7Student3{
int id;
String name;
D7Student3(int i,String n){
id=i;
name=n;
}
D7Student3(){}
void display(){System.out.println(id+" "+name);}
public static void main(String args[]){
D7Student3 s1=new D7Student3(537,"prasad");
D7Student3 s2=new D7Student3();
s2.id=s1.id;
s2.name=s1.name;
s1.display();
s2.display();
}
}