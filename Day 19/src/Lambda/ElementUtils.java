package Lambda;

/**
 * Created by Ehshan on 06/03/2015.
 */
public class ElementUtils {

    public static <E> E betterElement(TwoElementPredicate <E> E, E e1, E e2) {
        if (E.compare(e1, e2))
            return e1;
        else
            return e2;
    }
}