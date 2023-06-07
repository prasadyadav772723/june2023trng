import java.util.*;
class D6Pali{  
 public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in); 
  int r,sum=0;
   
  int n=sc.nextInt();
int j=n;
  while(n>0)
{    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(j==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}