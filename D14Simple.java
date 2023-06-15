import java.util.StringTokenizer;
class D14Simple{
public static void main(String args[]){
StringTokenizer st=new StringTokenizer("My name is Prasad"," ");
while(st.hasMoreTokens()){
System.out.println(st.nextToken());
}
}
}