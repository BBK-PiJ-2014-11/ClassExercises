package ExceptionsPart2;

/**
 * Created by Ehshan on 26/01/2015.
 */

import java.util.ArrayList;
public class Exception2 {

    public void launch() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        try {
            list.remove(0);
            list.remove(0);
            list.remove(0);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

