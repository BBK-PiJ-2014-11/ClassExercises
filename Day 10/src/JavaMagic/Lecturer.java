package JavaMagic;

/**
 * Created by Ehshan on 26/01/2015.
 */
public class Lecturer extends Teacher {

    public Lecturer(String name) {
        super(name);
    }

    public void doResearch(String topic) {
        System.out.println("Doing research on: " + topic);
    }
}
