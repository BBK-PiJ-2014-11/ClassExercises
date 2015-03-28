package Executor;

import java.util.concurrent.Executor;

/**
 * Created by Ehshan on 23/02/2015.
 */
public class ExecutorImpl implements Executor {

   private ThreadManager manager;

    public ExecutorImpl(){
        this.manager = new ThreadManager();
        Thread t = new Thread((Runnable) manager);
        t.run();
    }

    @Override
    public void execute(Runnable command) {
        this.manager.add(command);
    }

    public void shutdown() {
        this.manager.shutdown();
    }

}
