import java.util.StringTokenizer;
class D14Simple3{
public static void main(String args[]){
StringTokenizer st=new StringTokenizer("Demonstrating methods from StringTokenizer class"," ");
while(st.hasMoreTokens()){
System.out.println(st.nextToken());
}
}
}