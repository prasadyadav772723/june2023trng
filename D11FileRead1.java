import java.io.*;
class FileRead1{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("D:\\pm\\demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
while((i=br.read())!=-1){System.out.print((char)i);}
br.close();
fr.close();
}
}