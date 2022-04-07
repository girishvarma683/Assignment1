class Odd{
public static void main(String args[]){
int array[]=new int[]{1,2,3,4,5,6,7,8};
System.out.println("elements of an array in odd position:");
for(int i=0; i<=array.length; i=i+2){
	System.out.println(array[i]);
}
}
}