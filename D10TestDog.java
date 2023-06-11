class Animal{
public void move(){System.out.println("Animals can move");}
}
class Dog extends Animal{
public void move(){System.out.println("Doga can walk and move");}
}
class D10TestDog{
public static void main(String args[]){
Animal a=new Animal();
Animal b=new Dog();
a.move();
b.move();
}
}