class D9Array2{
public static void main(String args[]){
int[] numbers={2,-9,0,5,8,5,12,-25,45,76};
int sum=0;
double average;
for(int number:numbers){
sum+=number;
}
int arraLength=numbers.length;
average=((double)sum/(double)arraLength);
System.out.println("Sum= "+sum);
System.out.println("average= "+average);
}
}