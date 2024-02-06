package Day12;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable, Comparable<Task> {
    private static int nextId = 1;

    private int taskId;
    private String taskName;
    private int duration;
    private int priority;

    public Task(String taskName, int duration, int priority) {
        this.taskId = nextId++;
        this.taskName = taskName;
        this.duration = duration;
        this.priority = priority;
    }

    @Override
    public void run() {
        try {
            System.out.println("Executing " + taskName + "... started");
            TimeUnit.MILLISECONDS.sleep(duration);
            System.out.println("Executing " + taskName + "... Completed! (Duration: " + duration + " ms)");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }
}
