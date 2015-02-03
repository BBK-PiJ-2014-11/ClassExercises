package Persons;

/**
 * Created by Ehshan on 05/01/2015.
 *
 */
public class Person {
    public String getInitials(String fullName) {
        String result = "";
        String[] words = fullName.trim().split(" +");
        for (int i = 0; i < words.length; i++) {
            if (!(words[i].equals(" "))) {
                String getInitial = "" + words[i].charAt(0);
                result = result + getInitial.toUpperCase();
            }
        }
        return result;
    }

    //original method
    /*
    public String getInitials(String fullName) {
        String result = "";
        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            String nextInitial = "" + words[i].charAt(0);
            result = result + nextInitial.toUpperCase();
        }
        return result;
    }
    */
}
