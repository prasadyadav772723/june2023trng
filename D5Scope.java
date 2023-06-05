class D5Scope{
public static void main(String args[]){
int i=100;
System.out.println("value of i:"+i);
{
int j=55;
i=i+j;
System.out.println(i);
System.out.println(j);
}
System.out.println(i);
}}
