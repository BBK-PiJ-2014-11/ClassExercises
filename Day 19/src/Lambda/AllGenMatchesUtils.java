package Lambda;

/**
 * Created by Ehshan on 06/03/2015.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
/**
 * Same as AllMatches function - now works on any list type
 */
public class AllGenMatchesUtils {

    public static <E>  List<E> allTypeMatches(List<E> list, Predicate<E> compare){

        List<E> matches = new ArrayList<E>();

        for(E element : list){
            if(compare.test(element))
                matches.add(element);
        }
        return matches;
    }
}