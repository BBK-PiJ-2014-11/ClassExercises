package CodeFlow;

/**
 * Created by Ehshan on 26/01/2015.
 */
import java.util.ArrayList;

public class IntegerList {
    public void launch(int userInput) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        try {
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
            intList.remove(0);
            System.out.println(intList.get(userInput));
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        IntegerList newList = new IntegerList ();
        //newList.launch(0);
        //newList.launch(2);
        //newList.launch(4);
        newList.launch(6);
    }
}
