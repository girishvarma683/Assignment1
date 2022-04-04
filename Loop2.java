import java.util.Scanner;
class Loop2{
public static void main(String args[]){
	System.out.print("enter an number to be reversed: ");
	Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
	int reverse=0;
for(;num !=0;num=num/10)
{
int remainder=num % 10;
reverse=reverse*10+remainder;
}
System.out.print("The reversed number is: "+reverse);
}
}