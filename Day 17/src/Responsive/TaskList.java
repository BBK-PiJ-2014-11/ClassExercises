package Responsive;

/**
 * Created by Ehshan on 09/02/2015.
 */
import java.util.ArrayList;
import java.util.List;
public class TaskList {

    private List<Integer> list;

    public TaskList(){
        list = new ArrayList<Integer>();
    }

    public synchronized void addTask(int num) {
        list.add(num);
    }

    public String toString(){
        if(!isEmpty()){
            return list.toString();
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void clear(){
        list.clear();
    }

    public List<Integer> returnList(){
        return list;
    }
}
