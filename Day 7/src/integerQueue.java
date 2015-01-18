/**
 * Created by Ehshan on 13/11/2014.
 */
public class integerQueue {
    private integerNode firstNode;
    private int size;

    public integerQueue() {
        firstNode = null;
        size = 0;
    }

    public void insert(int number) {
        System.out.println("Inserting request " + number + "...");
        integerNode  newNode = new integerNode (number);
        // if no number exit
        if ( newNode == null ) {
            return;
            // if queue empty - first insert
        } else if(firstNode == null) {
            firstNode = newNode;
        } else {
           //places newNode(number) to head of queue
           newNode.setNext(firstNode);
           firstNode = newNode;
        }
        size++;
    }


    public void retrieve(int number) {
        System.out.print("Retrieving request " + number + "... ");
        //firstNode is empty = empty queue
        if(firstNode == null) {
            System.out.println("Nothing to retrieve, queue is empty");
            return;
            //if only one number in queue
        } else if(firstNode.getNext()== null) {
            // if number requested = to head of queue
            if(firstNode.getValue()== number ) {
                System.out.println("done.");
                firstNode = null;
            } else {
                System.out.println("Cannot retrieve "+number+", the number "+firstNode.getValue()+" is at the head of the queue");
                return;
            }
        } else {
            integerNode  currentNode = firstNode;
            //moves currentNode to end of queue
            while(currentNode .getNext()!=null) {
                currentNode  = currentNode .getNext();
            }
            // if number requested != to head of queue
            if(currentNode .getValue()!= number) {
                System.out.println("Cannot retrieve "+number+", the number "+currentNode.getValue()+" is at the head of the queue");
                return;
            } else {
                integerNode  previousNode = firstNode;
                //while previousNode next value not at end of queue
                while(previousNode.getNext()!=currentNode ) {
                    //moves previousNode to end of queue
                    previousNode = previousNode.getNext();
                }
                //removes next pointer
                previousNode.setNext(null);
                System.out.println("done.");
            }
        }
        size--;
    }

    public int size() {
        return size;
    }

    public void print() {
        System.out.println("There are " + size() + " requests in the queue.");
    }
}
