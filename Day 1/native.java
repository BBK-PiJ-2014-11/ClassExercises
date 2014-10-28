import java.util.Scanner;
public class native
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
;
System.out.println("Please Enter a number");
String s = System.console().readLine();
Int highest = Integer.parseInt(s);
Int middle = 0;
Int lowest = 0; 
System.out.println("Please Enter a number");
String s = System.console().readLine();
int num2 =Integer.parseInt(s);
if (num2<num1){
	lowest=num2;
}else{
	highest=num2;
	lowest=num1;
};
System.out.println("Please Enter a number"); 
String s = System.console().readLine();
int num3 =Integer.parseInt(s);
if(num3>highest){
	middle = highest;
	highest = num3;
}else if(num3<lowest){
	middle = lowest;
	lowest = num3;
}else{
	middle = num3;
}

System.out.println("The order of numbers from lowest to highest is: ");
System.out.println("highest");
System.out.println("middle");
System.out.println("highest");


}}

