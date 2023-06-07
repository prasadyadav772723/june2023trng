import java.util.Scanner;
class D7StringPalindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
String r="";
str=str.toLowerCase();
for(int i=str.length()-1;i>=0;i--){ r=r+str.charAt(i);}
if(str.equals(r))
{
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
}