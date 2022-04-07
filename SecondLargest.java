import java.util.Arrays;
class SecondLargest{
public static void main(String args[]){
int a[]={12,15,13,16,18,12};
System.out.println("Second Largest number: "+SecondLargest(a,6));
}
public static int SecondLargest(int[] a,int total){
Arrays.sort(a);
return a[total-2];
}
}
