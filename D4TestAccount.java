class Account{
int accno;
String name;
float amount;
void insert(int a,String n,float amt){
accno=a;
name=n;
amount=amt;
}
void deposit(float amt){
amount=amount+amt;
System.out.println(amt+"deposited");
}
void withdraw(float amt){
if(amount<amt){
System.out.println("Insufficient balanace");
}
else{
System.out.println(amt+"withdrawn");
}
}
void checkbalance(){
System.out.println("Balance is"+amount);
}
void display(){System.out.println(accno+" "+name+" "+amount);}
}
class D4TestAccount{
public static void main(String args[]){
Account a1=new Account();
a1.insert(87643,"Prasad",1000);
a1.display();
a1.checkbalance();
a1.deposit(4000);
a1.checkbalance();
a1.withdraw(3000);
a1.checkbalance();
}
}
