/**
 * Created by Ehshan
 */
public class checkout implements personQueue {

    private person head;
    private int checkoutNo;

    public checkout(int number) {
        head = null;
        checkoutNo = 0;
    }

    public void insert(person newPerson) {
        if (head == null) {
            head = newPerson;
            System.out.print(newPerson.name + " has joined checkout " + this.checkoutNo + "\n");
        } else {
            head.setNext(newPerson);
            System.out.print(newPerson.name + " has joined checkout no" + this.checkoutNo + "\n");
        }

    }

    public person retrieve() {
        if (this.head == null) {
            return null;
        } else {
            System.out.println(this.head.name + " has completed purchase");
            return this.head;
        }
    }
}
