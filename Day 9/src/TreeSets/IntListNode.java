package TreeSets;

/**
 * Created by Ehshan on 27/11/2014.
 */
public class IntListNode {

    private int number;
    private IntListNode next;

    public IntListNode(int number) {
        this.number= number;
        this.next = null;
    }

    public int getValue() {
        return this.number;
    }


    public IntListNode getNext() {
        return this.next;
    }

    public void setNext(IntListNode node) {
        this.next = node;
    }

    public String toString() {
        String s = "";
        s = s + this.number + ", ";
        if (this.next != null){
            s = s + this.next.toString();
        }
        return s;
    }

}


