package Responsive;

/**
 * Created by Ehshan on 09/02/2015.
 */
public class Task implements Runnable {

    private int time;
    private int threadNo;
    private TaskList finished;

    public Task(int time, int threadNo, TaskList finished){
        this.time = time;
        this.threadNo = threadNo;
        this.finished = finished;
    }

    @Override
    public void run() {
        try {
            boolean end = false;
            while(!end){
                Thread.sleep(time);
                finished.addTask(threadNo);
                end = true;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
