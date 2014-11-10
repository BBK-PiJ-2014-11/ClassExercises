/**
 * Created by Ehshan on 10/11/2014.
 */
import java.util.Scanner;

public class doWhile {
    private static Scanner scanner = new Scanner(System.in);

    static {
        scanner.useDelimiter(System.getProperty("line.separator"));
    }

    int mark;
    int dist;
    int pass;
    int fail;
    int count;


    public doWhile(int mark, int dist, int pass, int fail, int count) {
        this.mark = mark;
        this.dist = dist;
        this.pass = pass;
        this.fail = fail;
        this.count = count;

    }

    public void grades() {
        do {
            System.out.println("Input a mark sucker (-1 to exit)");
            mark = scanner.nextInt();
            if (mark >= 70) {
                dist++;
            } else if (mark >= 50) {
                pass++;
            } else {
                fail++;
            }
            count ++;
        }while(mark!=-1);
        System.out.println("There are "+count+" students: "+dist+ "distinctions "+pass+fail);
    }

}
