class Command{
public static void main(String[] args){
int sum=0;
for(int i=0; i<=args.length; i++){
try{
sum=sum+Integer.parseInt(args[i]);
	}catch(Exception e){
System.out.println( "invalid integer is:"+e.toString());
			}
		}
System.out.println("sum: "+sum);
}
}


