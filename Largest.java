class Largest{
public static void main(String args[]){
int array[]=new int []{20,10,35,52,6};
int max=array[2];
for(int i=0;i<array.length;i++){
if(array[i]>max)
	max=array[i];
	}
	System.out.println("largest number is:"+max);
}
}
