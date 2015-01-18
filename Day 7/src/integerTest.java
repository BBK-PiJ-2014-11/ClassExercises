/**
 * Created by Ehshan on 13/11/2014.
 */
public class integerTest {

    public static void main(String[] args) {

        //From array to list test
        System.out.println("Array to Linked List Test" );
        System.out.println("------------------------------------" );
        listUtilities newList = new listUtilities();
        int[] integerArray = {4, 11, 5, 29, 0, 1, 99, 8, 50, 10, -1};
        System.out.println("Converting an Array to a Linked List" );
        System.out.println("------------------------------------" );
        newList.arrayList(integerArray).print();
        System.out.println("");
        System.out.println("Sorting List in ascending order");
        System.out.println("------------------------------------" );
        newList.sortedList(integerArray).print();
        System.out.println("");

        //Queue test
        System.out.println("Integer Queue Test" );
        System.out.println("------------------------------------" );
        integerQueue newQueue = new integerQueue();
        newQueue.print();
        newQueue.insert(5);
        newQueue.insert(8);
        newQueue.insert(12);
        newQueue.print();
        newQueue.retrieve(5);
        newQueue.insert(13);
        newQueue.print();
        newQueue.retrieve(8);
        newQueue.retrieve(12);
        newQueue.print();
        newQueue.retrieve(13);
        newQueue.print();
        newQueue.insert(11);
        newQueue.insert(10);
        newQueue.retrieve(10);

        //Stack test
        System.out.println("Integer Stack Test" );
        System.out.println("------------------------------------" );
        integerStack newStack = new integerStack ();
        newStack.push(5);
        newStack.push(8);
        newStack.push(12);
        newStack.pop();
        newStack.push(13);
        newStack.pop();
        newStack.pop();
        newStack.pop();
        if(newStack.empty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("You need to remove "+newStack.size()+" number from the stack");
        }
        newStack.push(11);
        if(newStack.empty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("You still need to pop "+newStack.size()+" number from the stack");
        }
        newStack.pop();
        newStack.pop();
    }





}
