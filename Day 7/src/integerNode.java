/**
 * Created by Ehshan on 13/11/2014.
 */
public class integerNode {
    int number;
    integerNode next;
    integerNode previous;

    public integerNode(int num) {
        this.number = num;
        this.next = null;
        this.previous = null;
    }

    public integerNode getNext() {
        return this.next;
    }

    public void setNext(integerNode next) {
        this.next = next;
    }

    public int getValue() {
        return this.number;
    }

}
