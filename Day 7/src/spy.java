/**
 * Created by Ehshan on 10/11/2014.
 */
import java.util.Scanner;

public class spy {
    private static Scanner scanner = new Scanner(System.in);

    private static int spyCount = 0;
    private int id;


    public spy(int id){
        System.out.println("Enter spy id: ");
        this.id = scanner.nextInt();
        spyCount++;
        System.out.println("spy ID: " + this.id);
        System.out.println("spy Name: CONFIDENTIAL");
        System.out.println("The number of spies deployed is: " + getSpyCount());
    }


    public static int getSpyCount(){
        return spyCount;
    }

    public void die(){
        spyCount--;
        System.out.println("Spy " + this.id + " has failed in their mission");
        System.out.println("The number of spies deployed is: " + getSpyCount());
    }



    public static void main(String[] args){
        spy spy1= new spy(1);
        spy spy2 = new spy(2);
        spy spy3 = new spy(3);
        spy1.die();
        spy spy4= new spy(4);
        spy spy5= new spy(5);
        spy4.die();
    }

}
