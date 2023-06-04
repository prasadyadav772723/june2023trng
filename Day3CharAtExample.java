//Accessing first and last character by using the charAt() method
import java.lang.String;
public class Day3CharAtExample{
public static void main(String args[]){
String str="Welcome to Java Training";
int strLength=str.length();
System.out.println("Character at 0 index is:"+str.charAt(0));
System.out.println("character at last indexis:"+str.charAt(strLength-1));
}
}