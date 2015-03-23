package Responsive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ehshan on 09/02/2015.
 */
public class ResponsiveUI {

    private TaskList list;

    public ResponsiveUI(){
        this.list = new TaskList();
    }

    public static void main(String[] args) throws IOException {
        ResponsiveUI batch = new ResponsiveUI();
        batch.run();
    }

    public void run() throws IOException {
        for (int i=0; i<10; i++){
            int time = getInput(i);
            list.addTask(time);
            Runnable task = new Task(time, i, list);
            Thread t = new Thread(task);
            t.start();
            if (!list.isEmpty()){
                System.out.println("Finished tasks: " + list.returnList());
                list.clear();
            }
        }
    }

    public synchronized Integer getInput(int i) throws IOException {
        System.out.println("Enter the duration (in ms) of task " + (i) + ": ");
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        return Integer.parseInt(bufferedReader.readLine());
    }

}
