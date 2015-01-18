package TreeSets;

/**
 * Created by Ehshan on 27/11/2014.
 */
public class ListIntSet implements IntSet {

    private IntListNode firstNode;

    public ListIntSet() {
        firstNode = null;
    }

    public void add(int number) {
        if(firstNode == null) {
            firstNode = new IntListNode(number);
        } else if(contains(number)) {
            return;
        } else {
            IntListNode currentNode = firstNode;
            while(currentNode.getNext()!= null) {
                currentNode = currentNode.getNext();
            }
            IntListNode newNode = new IntListNode(number);
            currentNode.setNext(newNode);
        }
    }

    public boolean contains(int number) {
        if(firstNode == null) {
            return false;
        } else {
            IntListNode currentNode = firstNode;
            while(currentNode.getNext()!=null) {
                if(currentNode.getValue()== number) {
                    return true;
                }
                currentNode = currentNode.getNext();
            }
            return false;
        }
    }

    public boolean containsVerbose(int number) {
        if(firstNode == null) {
            //nothing to see here...move along please
            return false;
        } else {
            IntListNode currentNode = firstNode;
            while(currentNode.getNext()!=null) {
                System.out.println(currentNode.getValue());
                if(currentNode.getValue()== number) {
                    return true;
                }
                currentNode = currentNode.getNext();
            }
            System.out.println(currentNode.getValue());
            return false;
        }
    }
}

    /*
    moved to node class

    public String toString() {
        String s = "";
        if(firstNode == null) {
            return s;
        }
        s = s + firstNode.getValue()+ ", ";
        IntListNode currentNode = firstNode;
        while(currentNode.getNext()!=null){
            s = s + currentNode.getNext().getValue()+ ", ";
        }
        return s;
    }
    */

