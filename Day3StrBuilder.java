import java.lang.String;
class Day3StrBuilder{
public static void main(String args[]){
StringBuilder s1=new StringBuilder("Hello");
StringBuilder s2=new StringBuilder(" and Welcome");
StringBuilder s=s1.append(s2);
System.out.println(s.toString());
}
}