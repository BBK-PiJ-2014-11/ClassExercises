package Hailstones;

/**
 * Created by Ehshan on 19/01/2015.
 */
import java.util.ArrayList;

public class Hailstone {
    private ArrayList<Integer> hailstoneList;
    /**
     * Hailstone class constructor
     *
     * Creates an empty array list
     */
    public Hailstone() {
        this.hailstoneList = new ArrayList<Integer>();
    }


    public ArrayList<Integer> getHailstone(int num) {
        hailstoneList.add(num);
        if(num == 1) {
            return  hailstoneList;
        } else {
            if(num % 2 == 0) {
                return getHailstone(num / 2);
            } else {
                return getHailstone(3 * num + 1);
            }
        }
    }

    public void print(){
        for(int i = 0; i < hailstoneList.size(); i++) {
            System.out.println(hailstoneList.get(i));
        }
    }


}
