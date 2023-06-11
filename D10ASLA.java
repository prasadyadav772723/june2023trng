import java.util.Scanner;
import java.util.Arrays;
class D10ASLA{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();}
Arrays.sort(a);
System.out.print(a[0]);
System.out.println(" "+a[n-1]);
double sum=0;
double avg=0;
for(inti=0;i<a.length;i++){
sum+=a[i];
}
avg=sum/a.length;
System.out.println(sum);
System.out.println(avg);
}
}