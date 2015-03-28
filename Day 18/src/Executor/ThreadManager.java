package Executor;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Ehshan on 23/02/2015.
 */
public class ThreadManager {
    Queue<Runnable> tasks;
    Boolean running;


    public ThreadManager(){
        this.tasks = new LinkedList<Runnable>();
        this.running = true;
    }

    public synchronized void add(Runnable command){
        if(running){
            this.tasks.add(command);
            notifyAll();
        }
    }

    public void run() {
        while (running) {
            while (!tasks.isEmpty()) {
                Runnable nextTask = tasks.poll();
                nextTask.run();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
