package Lambda;

/**
 * Created by Ehshan on 03/03/2015.
 */
public class BetterString {

    public static void main(String[] args) {

        String one = "One";
        String two = "Two";

        String result = StringUtils.betterString((s1, s2) -> s1.length() > s2.length(), one, two);
        System.out.println(result);

        result = StringUtils .betterString((s1, s2) -> true, one, two);
        System.out.println(result);

    }
}
