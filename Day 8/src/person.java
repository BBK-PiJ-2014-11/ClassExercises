/**
 * Created by Ehshan on 17/11/2014.
 */
import java.util.Scanner;

public class person {

    private static Scanner scanner = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private int age;

    public person(String firstName, String lastName, int age ){
        System.out.println("Enter Person First Name");
        this.firstName = scanner.nextLine();
        System.out.println("Enter Person Last Name");
        this.lastName = scanner.nextLine();
        System.out.println("Enter Person Age");
        this.age = scanner.nextInt();
    }

    public static void main(String[] args){
        System.out.println("Create Five People");
        System.out.println("");
        person person1= new person("one","one",1);
        // System.out.println(person1.firstName);
        person person2= new person("two","two",2);
        person person3= new person("three","three",3);
        person person4= new person("four","four",4);
        person person5= new person("five","five",5);
    }

}
