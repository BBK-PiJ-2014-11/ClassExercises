package Lambda;

import java.util.Arrays;

/**
 * Created by Ehshan on 03/03/2015.
 */
public class ArraySortReference {
    public static void main(String[] args) {

        String[] numberArray = new String[]
                {"Zero","One","Two","Three","Four","Five",
                 "Six","Seven","Eight","Nine","Ten","Eleven"};

        Arrays.sort(numberArray, ArraySortMethod :: elookup);

        System.out.println("E first: "+Arrays.asList(numberArray));

    }
}
