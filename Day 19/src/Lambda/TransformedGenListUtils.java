package Lambda;

/**
 * Created by Ehshan on 06/03/2015.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Same as TransformedList function - now works on any list type
 */
public class TransformedGenListUtils {

    public static <E, T>  List<T>  transformedGenList(List<E> list, Function<E, T> transform){

        List<T> newList = new ArrayList<>();

        for(E element : list){
            newList.add(transform.apply(element));
        }
        return newList;
    }
}
