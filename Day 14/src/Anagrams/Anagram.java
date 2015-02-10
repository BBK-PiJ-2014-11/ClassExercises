package Anagrams;

/**
 * Created by Ehshan on 19/01/2015.
 */
import java.util.ArrayList;

public class Anagram{
    private ArrayList<String> anagramList;

    public Anagram() {
        this.anagramList = new ArrayList<String>();
    }

    public ArrayList<String> getAnagram(String word) {
        int num = factorial(word);
        while(anagramList.size()<=num) {
            String newWord = reorder(word);
            if (anagramList.size() == 0) {
                anagramList.add(newWord);
            } else {
                if(noRepeat(newWord));
                anagramList.add(newWord);
            }
        }
        return anagramList;
    }

    public boolean noRepeat(String word){
        for (int i = 0; i < anagramList.size(); i++) {
            if (word.equals(anagramList.get(i))) {
                return false;
            }
        }
        return true;
    }

    public String reorder(String word) {
        String randomString = "";
        while (word.length() != 0){
            int index = (int) Math.floor(Math.random() * word.length());
            char c = word.charAt(index);
            word = word.substring(0,index)+word.substring(index+1);
            randomString += c;
        }
        return randomString;
    }

    public int factorial(String word) {
        int n = word.length();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial  = factorial  * i;
        }
        return factorial ;
    }

    public void print() {
        for(int i = 0; i < anagramList.size(); i++ ) {
            System.out.println(anagramList.get(i));
        }
    }
}
