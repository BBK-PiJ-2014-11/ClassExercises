import java.util.Scanner;
public class text2number
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String wholeNum = new String();
System.out.println("Alright");
System.out.println("Please enter a number");
String s = scanner.next();
int len = s.length();
for (int i = 0; i<len; i++){
	char letter = s.charAt(i);
	if(letter != ','){
		wholeNum = wholeNum + letter;
	}
}

Float number = Float.parseFloat(wholeNum); 
double half = number/2;


System.out.println();
System.out.println(half);
}}

