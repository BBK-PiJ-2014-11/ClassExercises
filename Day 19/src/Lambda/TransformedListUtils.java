package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Ehshan on 06/03/2015.
 */
public class TransformedListUtils {

    public static List<String> transformedList(List<String> list, Function <String,String> transform){

        List<String> newList = new ArrayList<>();

        for(String s : list){
            newList.add(transform.apply(s));
        }
        return newList;
    }
}
