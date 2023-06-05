
import java.util.Scanner;
class D5IfExample{
public static void main(String args[]){
int i,j;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
j=sc.nextInt();
if(i<j){
System.out.println("j is the maximum number");
}
else{
System.out.println("i is the maximum number");
}
if(j<i){
System.out.println("j is the minimum number");
}
else{
System.out.println("i is the minimum number");
}
}
}

