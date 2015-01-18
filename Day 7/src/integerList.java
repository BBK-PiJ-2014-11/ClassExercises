/**
 * Created by Ehshan on 13/11/2014.
 */
public class integerList {

    private integerNode firstNode;

    public integerList() {
        firstNode = null;
    }

    public void add(int number) {
        integerNode newNode = new integerNode(number);
        if(firstNode==null) {
            firstNode = newNode;
        } else {
            integerNode lastNode = firstNode;
            while(lastNode.getNext()!=null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(newNode);
        }
    }

    public void insert(int number) {
        integerNode newNode = new integerNode(number);
        if(firstNode == null) {
            //empty list, set first node
            firstNode = newNode;
        } else if(firstNode.getValue()> newNode.getValue()) {
            //first node greater than new node, new becomes first
            newNode.setNext(firstNode);
            firstNode = newNode;
        } else if(firstNode.getNext() == null) {
            //only one entry, set next
            firstNode.setNext(newNode);
        } else {
            //get next
            integerNode currentNode = firstNode.getNext();
            //first node becomes previous node
            integerNode previousNode = firstNode;
            //from current(second)node, is less than/equal to passed
            while(currentNode.getValue()<= number) {
                //if there is no next node
                if(currentNode.getNext() == null) {
                    //place passed after current and exits
                    currentNode.setNext(newNode);
                    return;
                } else {
                    //move all nodes along by 1
                    currentNode = currentNode.getNext();
                    previousNode = previousNode.getNext();
                }
            }
            //places passed in list between previous and current
            newNode.setNext(currentNode);
            previousNode.setNext(newNode);
            //simple
        }
    }

    public void print() {
        if(firstNode == null) {
            System.out.println("Nothing here!");
        } else {
            integerNode currentNode = firstNode;
            System.out.println(currentNode.getValue());
            while(currentNode.getNext()!=null) {
                currentNode = currentNode.getNext();
                System.out.println(currentNode.getValue());
            }
        }
    }
}
