package JavaMagic;

/**
 * Created by Ehshan on 04/12/2014.
 */
public class LecturerTest {

    public static void main(String[] args) {

        System.out.println("Adding to Lecturer to Faculty");
        System.out.println("-----------------------------");
        Lecturer tom = new Lecturer("Tom");
        System.out.println("Lecturer: " + tom.getName());
        tom.teach("Computer Science");
        tom.research("AI");
        System.out.println("");


        System.out.println("Adding to Teacher to Faculty");
        System.out.println("-----------------------------");
        Teacher dick = new Lecturer("Dick");
        System.out.println("Teacher: " + dick.getName());
        dick.teach("Marketing");
        System.out.println("");

        System.out.println("Adding to Lecturer to Faculty");
        System.out.println("-----------------------------");
        Lecturer harry = new Lecturer("Harry");
        System.out.println("Lecturer: " + harry.getName());
        harry.teach("Philosophy");
        harry.doResearch("Metaphysics");
        System.out.println("");
    }

}

