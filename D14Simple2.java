import java.util.StringTokenizer;
class D14Simple2{
public static void main(String args[]){
StringTokenizer st=new StringTokenizer("My, name, is, Prasad");
System.out.println("Next token is : "+st.nextToken(","));
System.out.println("Next token is : "+st.nextToken(","));
System.out.println("Next token is : "+st.nextToken(","));
System.out.println("Next token is : "+st.nextToken(","));
}
}