import java.util.Scanner;
public class down
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
boolean finish = false;
boolean up = true;
System.out.println("Enter a number");
String s = System.console().readLine();
int num1 = Integer.parseInt(s);
while(!finish){
	System.out.println("Please enter another number");
	String t = System.console().readLine();
	int num2 = Integer.parseInt(t);
	if(num2 == -1){
		finish = true;
	}else if((num2 != num1 +1) && (num2 != num1 -1)){
		up = false;
	}
	num1 = num2;
}
if (up == true){
	System.out.println("YES");
}else{
	System.out.println("NO");
}
}}

