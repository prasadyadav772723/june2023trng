class Rectangle{
int length;
int width;
void insert(int l,int w){
length=l;
width=w;
}
void calculateArea(){System.out.println(length*width);}
}
class D4TestRectangle2{
public static void main(String args[]){
Rectangle r1=new Rectangle(), r2=new Rectangle();
r1.insert(15,6);
r2.insert(5,13);
r1.calculateArea();
r2.calculateArea();
}
}