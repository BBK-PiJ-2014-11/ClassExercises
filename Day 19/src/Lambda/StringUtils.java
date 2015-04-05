package Lambda;

/**
 * Created by Ehshan on 03/03/2015.
 */
public class StringUtils {

    public static String betterString(TwoStringPredicate f1, String s1, String s2){
        if(f1.compare(s1, s2))
            return s1;
        else
            return s2;
    }
}
