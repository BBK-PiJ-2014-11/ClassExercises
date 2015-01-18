package TreeSets;

/**
 * Created by Ehshan on 24/11/2014.
 */
public class SetTest {
    public static void main(String[] args) {

        //testing binary tree
        TreeIntSet treeTest = new TreeIntSet(5);

        System.out.println("Testing set of 6 numbers");
        System.out.println("------------------------");
        treeTest.add(11);
        treeTest.add(1);
        treeTest.add(5);
        treeTest.add(22);
        treeTest.add(8);
        System.out.println(treeTest.toString());
        System.out.println("");

        System.out.println("Testing contains");
        System.out.println("------------------------");
        System.out.println("Does the tree contain 11? "+treeTest.contains(11));
        System.out.println("Does the tree contain 12? "+treeTest.contains(12));
        System.out.println("");

        System.out.println("Testing containsVerbose");
        System.out.println("------------------------");
        System.out.println("Looking for 22?");
        System.out.println(treeTest.containsVerbose(22));
        System.out.println("");
        System.out.println("Looking for 12?");
        System.out.println(treeTest.containsVerbose(12));
        System.out.println("");

        //testing linked list
        ListIntSet listTest = new ListIntSet();

        System.out.println("Testing list of 6 numbers");
        System.out.println("------------------------");
        listTest.add(1);
        listTest.add(2);
        listTest.add(3);
        listTest.add(4);
        listTest.add(5);
        System.out.println(listTest.toString());
        System.out.println("");

        System.out.println("Testing contains");
        System.out.println("------------------------");
        System.out.println("Does the tree contain 1? "+listTest.contains(1));
        System.out.println("Does the tree contain 12? "+listTest.contains(12));
        System.out.println("");

        System.out.println("Testing containsVerbose");
        System.out.println("------------------------");
        System.out.println("Looking for 3?");
        System.out.println(listTest.containsVerbose(3));
        System.out.println("");
        System.out.println("Looking for 12?");
        System.out.println(listTest.containsVerbose(12));
        System.out.println("");


    }

}
