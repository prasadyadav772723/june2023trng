import java.util.Scanner;
import java.util.Arrays;
class D9SortElement{
public static void main(String args[]){
int n,x,i=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no.of elements you want in array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.print("Enter all the elements:");
for(i=0;i<n;i++){
a[i]=sc.nextInt();}

Arrays.sort(a);


for( int j:a) System.out.print(" "+j);

}
}