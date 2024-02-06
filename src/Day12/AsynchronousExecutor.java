package Day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousExecutor {
    private ExecutorService executor = Executors.newFixedThreadPool(5);

    public void execute(Task task) {
        executor.submit(task);
    }

    public void shutdown() {
        executor.shutdown();
    }
}

