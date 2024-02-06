package Day12;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronousTask {
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public void execute(Task task) {
        executor.submit(task);
    }

    public void shutdown() {
        executor.shutdown();
    }
}

