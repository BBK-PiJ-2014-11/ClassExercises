import java.util.Scanner;

/**
 * Created by Ehshan
 */
public class supermarket{

    private static Scanner scanner = new Scanner(System.in);

    checkout checkout1;
    checkout checkout2;

    public supermarket(checkout checkout1, checkout checkout2){
        this.checkout1 = checkout1;
        this.checkout2 = checkout2;
    }

    public void addPerson(person person, checkout checkout){
        checkout.insert(person);
    }

    public void servePerson(checkout checkout){
        checkout.retrieve();
    }

    public static void main(String[] args) {
        checkout checkout1 = new checkout(1);
        checkout checkout2  = new checkout(2);
        supermarket newSupermarket = new supermarket(checkout1, checkout2);
        newSupermarket.run();
    }

    public String inputName(){
        System.out.println("Enter Person Name");
        String name = scanner.nextLine();
        return name;
    }


    public void run(){
        String name1 = inputName();
        person person1 = new person(name1);
        addPerson(person1, checkout1);
        String name2 = inputName();
        person person2 = new person(name2);
        addPerson(person2, checkout2);
        String name3 = inputName();
        person person3 = new person(name3);
        addPerson(person3, checkout1);
        String name4 = inputName();
        person person4 = new person(name4);
        addPerson(person4, checkout2);
        servePerson(checkout1);
        servePerson(checkout2);
        servePerson(checkout1);
        servePerson(checkout2);

    }
}