import java.util.Scanner;
public class binary2decimal
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//call menu method
boolean choice = menuChoice();

//picking up user input
if(choice){
	System.out.println("Enter a binary number:");
	String binaryNum = scanner.next();
	double binaryAns = Converter.binary2decimal(binaryNum);
	System.out.println("");
	System.out.println ("The decimal conversion is "+binaryAns);
}else{
	System.out.println("Enter a decimal number:");
	String decimalString = scanner.next();
	int decimalNum = Integer.parseInt(decimalString);
	String decimalAns = Converter.decimal2binary(decimalNum);
	System.out.println("");
	System.out.println ("The binary conversion is "+decimalAns);
}


//menu method to define which conversion method to use
} private static boolean menuChoice(){
	int choice = 0; 
	while(!(choice == 1 || choice == 2)){
		System.out.println("Binary/Decimal converter: ");
		System.out.println	("If you wish to convert a binary number to a decimal, enter 1 ");
		System.out.println ("If you wish to convert a binary number to a decimal, enter 2.");
		String choiceString = scanner.next();
		choice = Integer.parseInt(choiceString);
		if (!(choice == 1 || choice == 2)){
		System.out.println("Try again sucker!");
		}
	}
	if (choice == 1){
		return true;
	}else{
		return false;
	}	
}		


}

class Converter{private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	
	//method not returning
	// included static, now resolved (why?)
	
	static double binary2decimal(String s){
		double decimalConversion = 0;
		for (int count = 0; count < s.length(); count++){
			int num = Integer.parseInt(s.substring(count, count+1));
			if (num == 1){
				decimalConversion = decimalConversion + (Math.pow(2,(s.length()-1)-count));
			}
		}
		return decimalConversion;
	}
	static String decimal2binary(int number){
		String binaryConversion = "";
		while (number > 0){
			if (number%2 == 0){
				binaryConversion = ("0" + binaryConversion);
				number = number/2;
			}else{
				binaryConversion = ("1" + binaryConversion);
				number = (number-1)/2;		
			}	
		}
		return binaryConversion;
	}

}	


