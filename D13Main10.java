import java.util.ArrayList;
class D13Main10{
public static  void main(String args[])
{
ArrayList<String>languages=new ArrayList<>();
languages.add("Java");
languages.add("python");
languages.add("C++");
System.out.println("ArrayList:"+languages);
languages.set(2,"JavaScript");
System.out.println("Modified ArrayList:"+languages);
}
}