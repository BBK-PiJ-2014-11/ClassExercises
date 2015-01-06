/**
 * Created by Ehshan
 */
public interface personQueue {
    /**
     * Adds another person to the queue.
     */
    void insert(person person);
    /**
     * Removes a person from the queue.
     */
    person retrieve();
}
