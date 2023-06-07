import java.util.Scanner;
class D7StringPalindrome3{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
str=str.toUpperCase();
String temp="";
int ascii;
for(int i=str.length()-1;i>=0;i--){ 
if(str.charAt(i)>='a'&& str.charAt(i)<='z')
{ascii=str.charAt(i);
ascii+=32;
temp=temp+(char) ascii;
}
else{
temp=temp+str.charAt(i);}
}
System.out.println("temp:"+temp);
str=temp;
String r="";
for(int i=str.length()-1;i>=0;i--){
r=r+str.charAt(i);}
if(str.equals(r)){
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
}
