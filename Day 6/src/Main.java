import java.util.Scanner;
public class Main {
    private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}

    public void main(String[] args) {
	// write your code here


        System.out.println("Enter first number");
        int userNum1 = scanner.nextInt();
        System.out.println("Enter second number");
        int userNum2 = scanner.nextInt();

        Calculator userInput = new Calculator(userNum1,userNum2);

    }

    class Calculator {
        int num1;
        int num2;

        Calculator(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        public void add(int num1, int num2){
            System.out.println(num1 + num2);
        }
        public void subtract(int num1, int num2){
            System.out.println(num1 - num2);
        }
        public void multiply(int num1, int num2){
            System.out.println(num1 * num2);
        }
        public void divide(int num1, int num2){
            double double1 = (double)num1;
            double double2 = (double)num2;
            System.out.println(double1/double2);
        }
        public void modulus(int num1, int num2){
            double double1 = (double)num1;
            double double2 = (double)num2;
            System.out.println(double1 % double2);
        }
    }


}

