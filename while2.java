import java.util.Scanner;
class While2{
public static void main(String args[]){
	System.out.print("enter an number to be reversed: ");
	Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
	int reverse=0;
while(num !=0)
{
int remainder=num % 10;
reverse=reverse*10+remainder;
num=num/10;
}
System.out.print("The reversed number is: "+reverse);
}
}