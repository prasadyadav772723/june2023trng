class Animal{
void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
void bark(){System.out.println("barking...");}
}
class Cat extends Animal{
void meow(){System.out.println("meowww...");}
}
class D7Inheritance4{
public static void main(String args[]){
Cat c=new Cat();
c.meow();
c.eat();
}
}