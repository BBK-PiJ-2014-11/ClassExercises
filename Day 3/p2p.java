import java.util.Scanner;
public class p2p
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Input values for 3 points

Point one = new Point();
System.out.println("Enter first x cordinate");
one.x = scanner.nextDouble();
System.out.println("Enter first y cordinate");
one.y = scanner.nextDouble();

Point two = new Point();
System.out.println("Enter second x cordinate");
two.x = scanner.nextDouble();
System.out.println("Enter second y cordinate");
two.y = scanner.nextDouble();

Point three = new Point();
System.out.println("Enter third x cordinate");
three.x = scanner.nextDouble();
System.out.println("Enter third y cordinate");
three.y = scanner.nextDouble();

//calculate lengths between points 

double lenght1_2 =  Math.sqrt((Math.pow((two.x - one.x),2) + Math.pow((two.y - one.y),2)));
double lenght1_3 =  Math.sqrt((Math.pow((three.x - one.x),2) + Math.pow((three.y - one.y),2)));
double lenght2_3 =  Math.sqrt((Math.pow((three.x - two.x),2) + Math.pow((three.y - two.y),2)));


//comparing length 1-2 with length 1-3 to find shortest

double shortest;
String pointText = new String("point 1 and point 2");
int comp1 = Double.compare(lenght1_2,lenght1_3);
if (comp1<0){
	shortest = lenght1_2;
}else{
	shortest = lenght1_3;
	pointText = new String("point 1 and point 3");
}

//comparing shortest length with length 2-3 

int comp2 = Double.compare(shortest,lenght2_3);
if (comp2>0){
	shortest = lenght2_3;
	pointText = new String("point 2 and point 3");
}

//output shortest

System.out.println("The shortest lenght was between "+pointText+" and was "+shortest);


//class definition

}}

class Point{private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	double x;
	double y;
}
