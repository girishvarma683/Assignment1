import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
String a,b="";
Scanner c=new Scanner(System.in);
System.out.println("Enter a String or Number:");
a=c.nextLine();
int d=a.length();
for(int i=d - 1; i >=0; i--)
{
	b=b + a.charAt(i);
}
if(a.equals(b))
{
	System.out.println("This is palindrom");
}
else
{
	System.out.println("This is not a palindrom");
}
}
}