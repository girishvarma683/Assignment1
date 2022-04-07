class Duplicate{
public static void main(String args[]){
int array[]=new int[]{1,2,5,3,7,8,2,4,5,6,7,8};
System.out.println("Duplicate numbers:");
for(int i=0; i<array.length; i++){
for(int j=i+1; j<array.length; j++){
	if(array[i]==array[j])
	System.out.println(array[j]+"");
}
}
}
}