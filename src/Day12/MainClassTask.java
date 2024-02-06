package Day12;
public class MainClassTask {
    public static void main(String[] args) {
        SynchronousTask syncExecutor = new SynchronousTask();
        syncExecutor.execute(new Task("Task A", 2000, 1));
        syncExecutor.execute(new Task("Task B", 1500, 2));
        syncExecutor.execute(new Task("Task C", 3000, 3));
        syncExecutor.shutdown();

        AsynchronousExecutor asyncExecutor = new AsynchronousExecutor();
        asyncExecutor.execute(new Task("Task X", 2000, 1));
        asyncExecutor.execute(new Task("Task Y", 1500, 2));
        asyncExecutor.execute(new Task("Task Z", 3000, 3));
        asyncExecutor.shutdown();

        PriorityExecutor priorityExecutor = new PriorityExecutor();
        priorityExecutor.execute(new Task("High-Priority Task", 3000, 3));
        priorityExecutor.execute(new Task("Medium-Priority Task", 2000, 2));
        priorityExecutor.execute(new Task("Low-Priority Task", 1500, 1));
        priorityExecutor.shutdown();
    }
}

