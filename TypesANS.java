import java.util.*;
public class TypesANS
{
public static void main(String[] args)
{
char ch;
System.out.println("Enter a character:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
System.out.println(ch + "is an alphabet");
else if(ch>='0'&& ch<='9')
System.out.println(ch + "is a digit number");
else
System.out.println(ch+"  is an special charecter");
}
}


/* if we want to know a special character use this logic..
if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0'&& ch<='9'))*/