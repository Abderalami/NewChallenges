package Day12;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PriorityExecutor {
    private ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 5, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue<>());

    public void execute(Task task) {
        executor.submit(task);
    }

    public void shutdown() {
        executor.shutdown();
    }
}
