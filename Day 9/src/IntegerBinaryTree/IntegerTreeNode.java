package IntegerBinaryTree;

/**
 * Created by Ehshan on 24/11/2014.
 */
public class IntegerTreeNode {
    int value;
    IntegerTreeNode right;
    IntegerTreeNode left;


    public IntegerTreeNode(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public void add(int newNumber) {
        if (newNumber > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(newNumber);
            } else {
                right.add(newNumber);
            }
        } else {
            if (left == null) {
                left = new IntegerTreeNode(newNumber);
            } else {
                left.add(newNumber);
            }
        }
    }

    public boolean contains(int number) {
        if(number == this.value) {
            return true;
        } else if(number > this.value) {
            if(right==null) {
                return false;
            } else {
                return right.contains(number);
            }
        } else {
            if(left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        }
    }
    public int getMax() {
        if(this.right == null) {
            return this.value;
        } else {
            return right.getMax();
        }
    }
    public int getMin() {
        if(this.left == null) {
            return this.value;
        } else {
            return left.getMin();
        }
    }

    public String toString() {
        String string  = "[" + this.value + " L";
        if (this.left == null) {
            string = string  + "[] R";
        } else {
            string  = string  + this.left.toString() + " R";
        }
        if (this.right == null) {
            string  = string  + "[]]";
        } else {
            string  = string  + this.right.toString() + "]";
        }
        return string ;
    }

    public int depth() {
        int value = 1;
        if (this.left != null) {
            value = value + this.left.depth();
        }
        if (this.right != null) {
            value = value + this.right.depth();
        }
        return value;
    }



}
