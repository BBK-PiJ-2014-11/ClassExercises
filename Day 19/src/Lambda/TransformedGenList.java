package Lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ehshan on 06/03/2015.
 */
public class TransformedGenList {

    public static void main(String[] args) {

        List<String> numberList = new ArrayList<>();

        numberList.add("One");
        numberList.add("Two");
        numberList.add("Three");
        numberList.add("Four");
        numberList.add("Five");
        numberList.add("Six");
        numberList.add("Seven");
        numberList.add("Eight");
        numberList.add("Nine");
        numberList.add("Ten");
        numberList.add("Eleven");

        List<String> excitingWords = TransformedGenListUtils.transformedGenList(numberList, s -> s + "");
        System.out.println(excitingWords.toString());

        List<String> eyeWords = TransformedGenListUtils.transformedGenList(numberList, s -> s.replace("i", "eye"));
        System.out.println(eyeWords.toString());

        List<String> upperCaseWords = TransformedGenListUtils.transformedGenList(numberList, String::toUpperCase);
        System.out.println(upperCaseWords.toString());
    }
}
