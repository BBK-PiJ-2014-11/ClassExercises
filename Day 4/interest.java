import java.util.Scanner;
public class interest
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
InterestRate interest1 = new InterestRate();
System.out.println("Enter total amount borrowed");
interest1.total = scanner.nextDouble();
System.out.println("Enter your interest rate");
interest1.rate = scanner.nextDouble();
System.out.println("Enter total years");
interest1.years = scanner.nextDouble();

calcualtor(interest1);
System.out.println (output);

} private static String calcualtor(InterestRate ir){
	output = "";
	double totalInterest = (rate/100)*total;
	double totalAmount = (totalInterest + total);
	output = output +" Total Amount to pay is "+totalAmount;
	double yearAmount = (totalAmount/years);
	output = output +" Yearly amount is "+yearAmount;
	double interestPaid = (totalIntrest/yearAmount);
	output = output +" Number of years before interest paid is "+interestPaid;
	return String;
}

}

class InterestRate{private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	double total;
	double rate;
	double years;
}
