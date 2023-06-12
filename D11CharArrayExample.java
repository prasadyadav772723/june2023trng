import java.io.*;
public class CharArrayEx{
public static void main(String[] ags)throws Exception {
char[] ary={'j','a','d','e','w'};
CharArrayReader reader=new CharArrayReader(ary);
int k=0;
while((k=reader.read())!=-1){
char c=(char)k;
System.out.print(c+":");
System.out.println(k);
}
}
}