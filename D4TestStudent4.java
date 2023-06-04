
class D4Student{
int rollno;
String name;
void insertRecord(int r,String n){
rollno=r;
name=n;
}
void displayInformation(){
System.out.println(rollno+" "+name);
}
}
class D4TestStudent4{
public static void main(String args[]){
D4Student s1=new D4Student();
D4Student s2=new D4Student();
s1.insertRecord(537,"prasad");
s2.insertRecord(526,"Santhosh");
s1.displayInformation();
s2.displayInformation();

}
}