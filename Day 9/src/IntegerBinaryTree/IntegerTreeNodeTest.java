package IntegerBinaryTree;

/**
 * Created by Ehshan on 24/11/2014.
 */
public class IntegerTreeNodeTest {

    public static void main(String[] args) {
        IntegerTreeNode treeTest = new IntegerTreeNode(5);

        System.out.println("Testing empty tree");
        System.out.println("------------------------");
        System.out.println("Tree dept is "+treeTest.depth());
        System.out.println("");


        System.out.println("Testing tree with 6 numbers");
        System.out.println("------------------------");
        treeTest.add(11);
        treeTest.add(1);
        treeTest.add(5);
        treeTest.add(22);
        treeTest.add(8);
        System.out.println("Tree dept is "+treeTest.depth());
        System.out.println("");

        System.out.println("Testing contains");
        System.out.println("------------------------");
        System.out.println("Does the tree contain 11? "+treeTest.contains(11));
        System.out.println("Does the tree contain 12? "+treeTest.contains(12));
        System.out.println("");

        System.out.println("Testing min value");
        System.out.println("------------------------");
        System.out.println("Minimum value: " + treeTest.getMin());
        System.out.println("");

        System.out.println("Testing max value");
        System.out.println("------------------------");
        System.out.println("Maximum value: " + treeTest.getMax());
        System.out.println("");

        System.out.println("Testing to string");
        System.out.println("------------------------");
        System.out.println("String output " + treeTest.toString());
        System.out.println("");

    }
}
