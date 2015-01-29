package Casting;
/**
 * Created by Ehshan on 08/12/2014.
 */
import java.util.Scanner;
public class ComparatorTest {

    public static void main(String[] args) {
        Comparator Comp = new Comparator();
        Scanner sc = new Scanner(System.in);

        System.out.println('\n' + "Enter two integers:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("getMax(" + n + "," + m + ") = " + Comp.getMax(n,m) + '\n');

        System.out.println("Enter two doubles:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("getMax(" + d1 + "," + d2 + ") = " + Comp.getMax(d1,d2) + '\n');

        System.out.println("Enter two integers:");
        String number1 = sc.next();
        String number2 = sc.next();
        System.out.println("getMax(\"" + number1 + "\",\"" + number2 + "\") = " + Comp.getMax(number1,number2));

        System.out.println("");
        System.out.println("Thanks for playing");

    }
}