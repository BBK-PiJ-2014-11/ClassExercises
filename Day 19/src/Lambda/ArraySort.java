package Lambda;

import java.util.Arrays;

/**
 * Created by Ehshan on 03/03/2015.
 */
public class ArraySort {

    public static void main(String[] args) {

        String[] numberArray = new String[]
                {"Zero","One","Two","Three","Four","Five",
                 "Six","Seven","Eight","Nine","Ten","Eleven"};

        // Sorted by length (i.e., shortest to longest)
        Arrays.sort(numberArray, (String s1, String s2) -> {
            if (s1.length() > s2.length())
                return 1;
            if (s1.length() == s2.length())
                return 0;
            return -1;
        });

        System.out.println("Length: "+Arrays.asList(numberArray));

        // Sorted by reverse length (i.e., longest to shortest)
        Arrays.sort(numberArray, (String s1, String s2) -> {
            if (s1.length() > s2.length())
                return -1;
            if (s1.length() == s2.length())
                return 0;
            return 1;
        });

        System.out.println("Reverse length: "+Arrays.asList(numberArray));

        // Sorted by first character
        Arrays.sort(numberArray, (String s1, String s2) -> {

            if(s1.charAt(0) > s2.charAt(0))
                return 1;
            if(s1.charAt(0) == s2.charAt(0))
                return 0;
            return -1;
        });

        System.out.println("First Character: "+Arrays.asList(numberArray));

        // Sorted by Strings that contain “e” first, everything else second
        Arrays.sort(numberArray, (String s1, String s2) -> {
            if(!s1.contains("e") && s2.contains("e"))
                return 1;
            if(s1.contains("e") && s2.contains("e"))
                return 0;
            return -1;
        });

        System.out.println("E first: "+Arrays.asList(numberArray));
    }
}
