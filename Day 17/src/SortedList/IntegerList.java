package SortedList;

/**
 * Created by Ehshan on 10/02/2015.
 */
public class IntegerList {

    private IntegerNode first;
    private IntegerNode last;
    private boolean sorted;

    public IntegerList() {
        first = null;
        last = null;
        sorted = true;
    }

    public boolean add(Integer number) {
        IntegerNode newNode = new IntegerNode(number);
        if(first == null) {
            first = newNode;
        } else {
            last = first;
            while(last.getNext()!=null) {
                last = last.getNext();
            }
            last.setNext(newNode);
        }
        return sorted = false;
    }

    public IntegerNode getFirst() {
        return first;
    }

    public  void sort(IntegerNode current) {
        if(current.getNext() !=null) {
            IntegerNode next = current.getNext();
            int comparison = Integer.compare(current.getValue(), next.getValue());
            if (comparison > 0) {
                //TODO
//                IntegerNode temp = current;
//                current = next;
//                next = temp;
            }
            sort(next.getNext());
        }
    }

    public int get(int n){
        //TODO
        return first.getValue();
    }

    public void print() {
        if(first == null) {
            System.out.println("Nothing here!");
        } else {
            IntegerNode current = first;
            System.out.println(current.getValue());
            while(current.getNext()!=null) {
                current = current.getNext();
                System.out.println(current.getValue());
            }
        }
    }
}
