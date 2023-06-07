import java.util.Scanner;
class D6Largest{
public static void main(String args[]){
int i,j,k;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
j=sc.nextInt();
k=sc.nextInt();
if(i>j){
System.out.println(i);
}
else if(j>i){
System.out.println(j);
}
else {
System.out.println(k);
}
}
}


