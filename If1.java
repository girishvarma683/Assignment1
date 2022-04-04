import java.util.Scanner;
class If1{
public static void main(String args[]){
	int num;
	System.out.print("enter an num: ");
	 Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
if(((num ==0))){
	System.out.println("zero");
}else if(((num ==1))){
	System.out.println("one");
}else if(((num ==2))){
	System.out.println("two");
}else if(((num ==3))){
	System.out.println("three");
}else{
	System.out.println("invalid number");
}
}
}
