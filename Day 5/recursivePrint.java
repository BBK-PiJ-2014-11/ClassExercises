import java.util.Scanner;
public class recursivePrint
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
int number = 6;
printNumbers(number);

} private static void printNumbers(int n) {
	System.out.println(n);
	if (n <= 0) {
		return;
	}
	System.out.println(n);
	printNumbers(n-2);
	printNumbers(n-3);
	System.out.println(n); 
}
}

