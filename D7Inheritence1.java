class Inheritance1{
float salary=50000;
}
class  Programmer extends Inheritance1{
int bonus=1000;
public static void main(String args[]){
Programmer p=new Programmer();
System.out.println("Programmer salary is :"+p.salary);
System.out.println("Programmer bonus is :"+p.bonus);
}
}

