package SortedList;

/**
 * Created by Ehshan on 10/02/2015.
 */
public class IntegerNode {
    Integer number;
    IntegerNode next;
    IntegerNode previous;

    public IntegerNode(Integer num) {
        this.number = num;
        this.next = null;
        this.previous = null;
    }

    public IntegerNode getNext() {
        return this.next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public int getValue() {
        return this.number;
    }

    public void setValue(int value){
        this.number = value;
    }

}
