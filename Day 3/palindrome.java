import java.util.Scanner;
public class palindrome
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{

String invert = new String(); 

System.out.println("Enter a line");
String line = scanner.next();
System.out.println("");
int len = line.length();


for (int i = 0; i < len; i++){
	char c = line.charAt(i);
	invert = c + invert;	
}

if (line.equals(invert)){
	System.out.println(line+" is a palindrome");
}else{
	System.out.println(line+" is not a palindrome");
}
}}

