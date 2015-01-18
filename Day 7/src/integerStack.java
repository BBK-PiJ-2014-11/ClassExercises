/**
 * Created by Ehshan on 13/11/2014.
 */
public class integerStack {
    private integerNode firstNode;
    private int size;

    public integerStack() {
        firstNode = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public void push(int number) {
        System.out.println("Pushing " + number + "...");
        //first push
        if(firstNode == null) {
            firstNode = new integerNode(number);
        } else {
            integerNode newNumber = new integerNode(number);
            //places newNumber at top of stack
            newNumber.setNext(firstNode);
            firstNode = newNumber;
        }
        size++;
    }

    public void pop() {
        System.out.print("Popping... ");
        // empty stack
        if(firstNode == null) {
            System.out.println("Stack is empty.");
            return;
        } else {
            System.out.println("it's a " + firstNode.getValue());
            // create new top of stack
            if(firstNode.getNext()!=null) {
                firstNode = firstNode.getNext();
            } else {
                firstNode = null;
            }
            size--;
        }
    }

    public boolean empty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }
}
