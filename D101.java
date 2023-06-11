import java.util.*;
class D101{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
char b=s.next().charAt(0);
int n=a.length();
for(int i=0;i<n;i++)
{
if((a.charAt(i))!=b)
{
System.out.print(a.charAt(i));
}}}}