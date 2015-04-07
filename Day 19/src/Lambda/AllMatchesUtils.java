package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Ehshan on 06/03/2015.
 */
public class AllMatchesUtils {

    public static List<String> allMatches(List<String> list, Predicate<String> compare){

        List<String> matches = new ArrayList<>();
        for(String s : list){
            if(compare.test(s))
                matches.add(s);
        }
        return matches;
    }
}
