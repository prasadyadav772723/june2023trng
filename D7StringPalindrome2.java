import java.util.Scanner;
class D7StringPalindrome2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
String temp="";
int ascii;
for(int i=str.length()-1;i>=0;i--){ 
if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
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
