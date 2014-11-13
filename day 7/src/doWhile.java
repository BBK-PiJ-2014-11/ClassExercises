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

    public void grades(int mark) {
        count = -1; // set to -1 to off set exit entry
        do {
            System.out.println("Input a mark sucker (-1 to exit)");
            mark = scanner.nextInt();
            if (mark <-1 || mark >100) {
                System.out.println("Only marks 0-100 are valid");
            } else {
                if (mark >= 70) {
                    dist++;
                } else if (mark >= 50) {
                    pass++;
                } else if (mark >= 0) {
                    //else if here to avoid counting -1 as valid entry
                    fail++;
                }
                count ++;
            }
        }while(mark!=-1);
        System.out.println("There are "+count+" students: "+dist+ " distinctions "+pass+" passes and "+fail+" fails");
    }

    public static void main(String[] args) {
        doWhile test = new doWhile(0,0,0,0,0);
        test.grades(test.mark);
   }

}


