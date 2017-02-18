package school.lemon.changerequest.java.multithreading.hw2.task2;

/**
 * Unexpected errors on task execution
 *
 */
public class TaskExecutionFailedException extends Exception {

    public TaskExecutionFailedException(String message) {
        super(message);
    }

    public TaskExecutionFailedException(Throwable cause) {
        super(cause);
    }

    public TaskExecutionFailedException(String message, Throwable cause) {
        super(message, cause);
    }

}
