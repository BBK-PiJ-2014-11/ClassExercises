package Lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ehshan on 06/03/2015.
 */
public class AllMatches {

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

        List<String> shortWords = AllMatchesUtils.allMatches(numberList, s -> s.length() < 4);
        System.out.println(shortWords.toString());

        List<String> wordsWithE = AllMatchesUtils.allMatches(numberList, s -> s.contains("e"));
        System.out.println(wordsWithE.toString());

        List<String> evenLengthWords = AllMatchesUtils.allMatches(numberList, s -> (s.length() % 2) == 0);
        System.out.println(evenLengthWords.toString());
    }
}
