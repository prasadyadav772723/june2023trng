import java.util.Scanner;
class D5palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
int sum=0;
int temp;
System.out.out.println("Enter a number series:");
n=sc.nextInt();
temp=n;
while(n>0){
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum){
System.out.println("given number is a palndrome");
}
else{
System.out.println("given number is not a palndrome");
}
}
}
}