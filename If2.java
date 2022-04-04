import java.util.Scanner;
class If2{
public static void main(String args[]){
	int num;
	System.out.print("enter an num: ");
	 Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
if(((num ==1))){
	System.out.println("unit");
}else if(((num ==10))){
	System.out.println("ten");
}else if(((num ==100))){
	System.out.println("hundred");
}else if(((num ==1000))){
	System.out.println("thousand");
}else{
	System.out.println("invalid number");
}
}
}
