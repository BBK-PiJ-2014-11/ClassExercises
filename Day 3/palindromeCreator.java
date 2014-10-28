import java.util.Scanner;
public class palindromeCreator
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{

boolean palin = true;

String invert = "";
System.out.println("Enter a line");
String line = System.console().readLine();
System.out.println("");
int len = line.length();

for (int i = 0; i < len; i++){
	char c = line.charAt(i);
	invert = c + invert;
	
}

System.out.println(line+invert);

}}

