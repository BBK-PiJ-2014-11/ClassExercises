/**
 * Created by Ehshan
 */
import java.util.Scanner;

public class person {

    private static Scanner scanner = new Scanner(System.in);

    public String name;
    public person next;

    public String getName(){
        return this.name;
    }

    public person(String name){
        this.setName(name);
    }


    public void setName(String name){
       this.name = name;
    }


    public person getNext(){
        return this.next;
    }

    public void setNext(person person){
        this.next = person;
    }

    /* public void setName(String name){
        System.out.println("Enter Person Name");
        this.name = scanner.nextLine();
    }*/

    /*public static void main(String[] args){
        System.out.println("Create Five People");
        System.out.println("");
        person person1= new person("one");
        // System.out.println(person1.name);
        person person2= new person("two");
        person person3= new person("three");
        person person4= new person("four");
        person person5= new person("five");
    }*/

}
