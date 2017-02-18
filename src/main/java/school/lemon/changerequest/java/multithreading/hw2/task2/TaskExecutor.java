package school.lemon.changerequest.java.multithreading.hw2.task2;

/**
 * Interface for task executor.
 */
public interface TaskExecutor {

    /**
     * Add task to execution.
     * @throws NullPointerException if task == null
     * @throws IllegalStateException in cases when method can't be called (e.g. after shutdown was called)
     */
    void submit(Task task) throws NullPointerException, IllegalStateException;

    /**
     * Stop task executor.
     * The executor should wait for the finishing of all existing tasks.
     */
    void shutdown();

}
