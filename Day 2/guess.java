import java.util.Scanner;
public class guess
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//int numberToGuess = Math.abs(1000 * Math.random());
int numberToGuess = 12;

//Testing number match
System.out.println("numberToGuess");

boolean correct = false;
int count = 0;
System.out.println("Try to guess my number!");
while(!correct){
	System.out.println ("Tell me a number");
	String s = System.console().readLine();
	int number = Integer.parseInt(s);
	if (number == numberToGuess){
		correct = true;
		System.out.println("CORRECT!");
	}else if (number < numberToGuess){
		System.out.println("No! My number is higher");
	}else{
		System.out.println("No! My number is lower");
	}
	count ++;
}
System.out.println("You needed "+count+" guesses.");
}}

