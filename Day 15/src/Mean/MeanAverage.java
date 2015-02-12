package Mean;

/**
 * Created by Ehshan on 26/01/2015.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MeanAverage {

    Scanner input = new Scanner(System.in);
    private List<Integer> integerList;
    private int numbers;

    public MeanAverage() {
        integerList = new ArrayList<Integer>();
        numbers = 10;
    }

    public List<Integer> getInput() {
        try {
            //System.out.println("Enter 10 numbers for Mean calculation ");
            System.out.println("Enter "+numbers+" numbers for Mean calculation ");
            String inputArray = input.nextLine();
            String[] inputString = inputArray.split("\\s+");
            if (inputString.length < numbers) {
                System.out.println("You didn't enter enough numbers, try again");
                System.out.println("");
                getInput();
            } else if (inputString.length >numbers) {
                System.out.println("You entered too many numbers, try again");
                System.out.println("");
                getInput();
            }else{
                for (int i = 0; i<inputString.length; i++){
                    String valueString = inputString[i];
                    integerList.add(Integer.parseInt(valueString));
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Error, not a integer");
        }
        return integerList;
    }

    public int getNumbers() {
        try {
            System.out.println("How many number would you like to enter?  ");
            numbers = input.nextInt();
        } catch (NumberFormatException ex) {
            System.out.println("Error, not a integer");
            getNumbers();
        }
        return numbers;
    }

    public Double getMean(List<Integer> integerList) {
        Double mean = 0.0;
        int count = 0;
        for (int i = 0; i<integerList.size(); i++){
            mean = mean + integerList.get(i).intValue();
            count++;
        }
        mean = mean / count;
        return mean;
    }

    public static void main(String[] args) {
        MeanAverage newMean = new MeanAverage();
        newMean.launch();
    }

    public void launch() {
        getNumbers();
        System.out.println("The mean is " + getMean(getInput()));
    }
}
