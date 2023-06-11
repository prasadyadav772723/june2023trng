class Animal{
public void move(){System.out.println("Animals can move");}
}
class Wild extends Animal{
public void move(){System.out.println("Wild class called");}
}
class Pet extends Animal{
public void move(){System.out.println("Dog can walk and move");}
}
class D10TestAnimal{
public static void main(String args[]){
Animal a=new Animal();
Animal b=new Wild();
Animal p=new Pet();
a.move();
b.move();
p.move();
}
}