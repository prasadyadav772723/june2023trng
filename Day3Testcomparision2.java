import java.lang.String;
class Day3Testcomparision2{
public static void main(String args[]){
String s1="Prasad";
String s2="Prasad";
String s3=new String("PRasad");
String s4="Yadav";
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s1.equals(s4));
}
}

