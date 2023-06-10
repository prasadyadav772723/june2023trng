import java.util.Scanner;
import java.util.Arrays;
class D9LargestElement1{
public static void main(String args[]){
int n,i=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no.of elements you want in array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.print("Enter all the elements:");
for(i=0;i<n;i++){
a[i]=sc.nextInt();}

for(i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++)
{ int temp=0;
if(a[i]<a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for( int x:a) System.out.print(x+" ");
System.out.println();
System.out.println("printing first largest element:"+a[0]);
}
}