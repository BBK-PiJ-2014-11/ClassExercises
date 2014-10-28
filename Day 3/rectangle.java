import java.util.Scanner;
public class rectangle
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//input values for points


Point upLeft = new Point();
System.out.println("Enter first x cordinate");
upLeft.x = scanner.nextDouble();
System.out.println("Enter first y cordinate");
upLeft.y = scanner.nextDouble();

Point downRight = new Point();
System.out.println("Enter second x cordinate");
downRight.x = scanner.nextDouble();
System.out.println("Enter second y cordinate");
downRight.y = scanner.nextDouble();

//calculate lengths between points 

double width = (Math.abs(downRight.x-upLeft.x));
double length = (Math.abs(downRight.y-upLeft.y));
double hypotenuse =  Math.sqrt((Math.pow((downRight.x - upLeft.x),2) + Math.pow((downRight.y - upLeft.y),2)));
double perimeter = ((length*2)+(width*2));
double area = (length*width);


System.out.println("The width was "+width);
System.out.println("The length was "+length);
System.out.println("The perimeter was "+perimeter);
System.out.println("The hypotenuse was "+hypotenuse);
System.out.println("The area was "+area+" squared");


}}

class Point{private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	double x;
	double y;
}
