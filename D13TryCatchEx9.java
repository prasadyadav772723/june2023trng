import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class D13TryCatchEx9{
public static void main(String args[]){
PrintWriter pw;
try{
pw=new PrintWriter("pmp.txt");
pw.println("saved");
}
catch(Exception e){
System.out.println(e);
}
System.out.println("File saved succefully...");
}
}