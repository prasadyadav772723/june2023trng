// java program to find the ASCII values of a character 
import java.util.*;
public class AsciiValues{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch;
ch=sc.next().charAt(0);
int a=ch;//(or int ascii=(int) ch;)
System.out.println("ASCII value of "+ch+ " is:" +a);
}
}
