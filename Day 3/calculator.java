import java.util.Scanner;
public class calculator
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println("Please enter 2 numbers for a simple calculation");
double num=0, num1=0, num2=0, total =0;
String opperator = "";
for (int i = 0; i<2; i++){
	System.out.println("Please enter a number");
	String s = System.console().readLine();
	num = Double.parseDouble(s);
		num1 = num2;
	num2 = num;	
}
System.out.println("If you wish to add the 2 numbers please enter 1");
System.out.println ("");
System.out.println("If you wish to subtract the second number from the first please enter 2");
System.out.println ("");
System.out.println("If you wish to multiply the 2 numbers please enter 3");
System.out.println ("");
System.out.println("If you wish to divide the first number by the first please enter 4");
System.out.println ("");
System.out.println ("Enter opperator");
String t = System.console().readLine();
int opp = Integer.parseInt(t);
if(opp==1){
	total=num1+num2;
	opperator = ("plus");
}else if(opp==2){
	total=num1-num2;
	opperator = ("minus");
}else if(opp==3){
	total=num1*num2;
	opperator = ("multiplied by");
}else if (opp==4){
	total=num1*num2;
	opperator = ("divided");
}

System.out.println ("Your sum was "+num1+" "+opperator+" "+num2+" which give the result "+total);
}}

