import java.util.Scanner;
public class D7ExtractDigit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String r="";
int len=str.length();
for(int i=0;i<=len-1;i++){
if(str.charAt(i)>='0' && str.charAt(i)<='9'){
r=r+str.charAt(i);}
}
System.out.println(r);
}
}

 