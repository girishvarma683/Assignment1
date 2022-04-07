class Smallest{
public static void main(String args[]){
int array[]=new int []{20,10,35,52,50};
int min=array[2];
for(int i=0;i<array.length;i++){
if(array[i]<min)
	min=array[i];
	}
	System.out.println("Smallest number is:"+min);
}
}
