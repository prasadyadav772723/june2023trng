class D13TryCatchEx8{
public static void main(String args[])
{
try{
int arr[]={3,6,2,7};
System.out.println(arr[10]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
System.out.println("rest of the code...");
}
}