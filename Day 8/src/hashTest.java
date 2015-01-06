/**
 * Created by Ehshan
 */
import java.util.Scanner;

public class hashTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give me a string and I will calculate its hash code >> ");
        int hash = scan.nextInt();
        int smallhash = hashUtilities.shortHash(hash);
        System.out.println("0 < " + smallhash + " < 1000");
    }

}