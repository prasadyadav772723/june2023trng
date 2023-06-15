import java.util.StringTokenizer;
class D14Simple4{
public static void main(String args[]){
StringTokenizer st=new StringTokenizer("Demonstrating methods from StringTokenizer class"," ");
while(st.hasMoreElements()){
System.out.println(st.nextToken());
}
}
}