import java.util.Scanner;
public class max
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
Boolean finish = false;
System.out.println("Please enter a positive Number");
String s = System.console().readLine();
int highest = Integer.parseInt(s);
while(!finish){
	System.out.println("Please enter another number");
	String t = System.console().readLine();
	int num2 = Integer.parseInt(t);
	if(num2 == -1){
		finish = true;
	}else{
		if(num2 > highest){
			highest = num2;
		}
	}
}

System.out.println("Highest Number was: "+highest);
}}

