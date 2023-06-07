class D7Student2{
int id;
String name;
D7Student2(int i,String n){
id=i;
name=n;
}
D7Student2(D7Student2 s){
id=s.id;
name=s.name;
}
void display(){System.out.println(id+" "+name);}
public static void main(String args[]){
D7Student2 s1=new D7Student2(537,"prasad");
D7Student2 s2=new D7Student2(s1);
s1.display();
s2.display();
}
}