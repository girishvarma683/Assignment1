class Reverse{
public static void main(String args[]){
int array[]=new int[]{1,2,3,4,5,6,7,8};
System.out.println("elements of an array in reverse order:");
for(int i=array.length-1; i>=0; i--){
	System.out.println(array[i]+"");
}
}
}