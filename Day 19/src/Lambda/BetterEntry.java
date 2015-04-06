package Lambda;

/**
 * Created by Ehshan on 06/03/2015.
 */
public class BetterEntry {

    public static void main(String[] args) {

        String one = "One";
        String two = "Two";

        String result = ElementUtils.betterElement((s1, s2) -> s1.length() > s2.length(), one, two);
        System.out.println(result);

        result = ElementUtils. betterElement((s1, s2) -> true, one, two);
        System.out.println(result);

    }
}
