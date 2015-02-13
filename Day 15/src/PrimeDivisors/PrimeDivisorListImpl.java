package PrimeDivisors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ehshan on 30/01/2015.
 */
public class PrimeDivisorListImpl implements PrimeDivisorList {

    private List<Integer> list;
    /**
     * PrimeDivisorListImpl constructor class
     */
    public PrimeDivisorListImpl() {
        this.list = new ArrayList<Integer>();
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void add(Integer primeNumber) {
        try{
            if ( !checkPrime(primeNumber) ) {
                throw new IllegalArgumentException("That is not a Prime Number mate!");
            }
            list.add(primeNumber);
        }catch (NullPointerException ex){
            System.out.println("Why do you want to add nothing?");
        }
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        String s ="";
        Integer result = 1;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) != null){
                if (!lastNum(i)){
                    result = result * list.get(i);
                    s = s + list.get(i) + " * ";
                }else{
                    result = result * list.get(i);
                    s = s + list.get(i);
                }
            } else {
                return s;
            }
        } return "[ " + s +" = " + result + " ]";
    }
    /**
     * Checks if passed integer is [a] prime [time player].
     *
     * @param number
     * @return true if prime number, false if not
     */
    private boolean checkPrime(Integer number) {
        if ( number == 1 || number == 2 ) {
            return true;
        }
        else {
            for( int i = 2; i < number; i++ ) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Checks if passed integer is the last index in list.
     *
     * @param i the list index
     * @return true if last, false if not
     */
    private boolean lastNum(int i){
        if (i == list.size()-1){
           return true;
        }
        return false;
    }

}
