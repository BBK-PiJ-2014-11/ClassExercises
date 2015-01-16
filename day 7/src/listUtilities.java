/**
 * Created by Ehshan on 13/11/2014.
 */
public class listUtilities {
    //converting and array to list
    public static integerList arrayList(int[] intArray) {
        integerList newIntegerList = new integerList();
        for (int i = 0; i < intArray.length; i++) {
            newIntegerList.add(intArray[i]);
        }
        return newIntegerList;
    }

    public static integerList sortedList(int[] intArray) {
        //A sorted list
        integerList newIntegerList = new integerList();
        for (int i = 0; i < intArray.length; i++) {
            newIntegerList.insert(intArray[i]);
        }
        return newIntegerList;
    }
}