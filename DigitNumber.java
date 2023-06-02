import java.util.*;
public class DigitNumber
{
public static void main(String[] args)
{
char ch;
System.out.println("Enter a number:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
if(ch>='0'&& ch<='9')
System.out.println(ch + "is a digit number");
else
System.out.println(ch + "is not a digit number");
}
}