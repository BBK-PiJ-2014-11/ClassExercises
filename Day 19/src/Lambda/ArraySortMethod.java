package Lambda;

/**
 * Created by Ehshan on 03/03/2015.
 */
public class ArraySortMethod {

    public static int elookup(String s1, String s2){
        if(!s1.contains("e") && s2.contains("e"))
            return 1;
        if(s1.contains("e") && s2.contains("e"))
            return 0;
        return -1;
    }
}
