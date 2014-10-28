import java.util.Scanner;
public class change
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
double num=0, num1=0, num2=0, total=0, change=0, cost=0, paid=0;
System.out.println("Enter the cost of your purchase");
String s = System.console().readLine();
cost = Double.parseDouble(s);
System.out.println("Enter the amount you paid");
String t = System.console().readLine();
paid = Double.parseDouble(t);
change = paid-cost;
System.out.println("");
System.out.println(cost);
System.out.println("");
System.out.println (paid);
System.out.println("");
System.out.println (change);

}}

