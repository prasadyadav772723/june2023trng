class Author{
String authorName;
int age;
String place;
Author(String name,int age,String place)
{
this.authorName=name;
this.age=age;
this.place=place;
}}
class Book
{
String name;
int price;
Author author;
Book(String n,int p,Author author)
{
this.name=n;
this.price=p;
this.author=author;
}
public static void main(String args[]){
Author author=new Author("Shiva",38,"cdp");
Book b=new Book("Love ",143,author);
System.out.println("Book name:"+b.name);
System.out.println("Book price:"+b.price);
System.out.println("--------Auther Details------");
System.out.println("Auther Name:"+b.author.authorName);
System.out.println("Auther age:"+b.author.age);
System.out.println("Auther place:"+b.author.place);
}
}