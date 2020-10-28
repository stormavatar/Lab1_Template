package pt.pa.adts;

/**
 * Describes a queue abstract data type
 *
 * @param <T>Element type to store in queue
 *
 * @arthur Joao Caetano  - 190221010
 */
public interface Queue<T> {
    /**
     * Inserts the attributed element T at the end of the Queue
     *
     * @param element
     *
     * @throws FullQueueException if the queue if full.
     */
    public void enqueue(T element) throws FullQueueException;

    /**
     * Removes the element at the front of the queue
     *
     * @return element
     */
    public T dequeue() throws EmptyQueueException;

    /**
     * Returns the first element in the queue without removing it
     *
     * @return element
     * @throws EmptyQueueException
     */
    public T front() throws EmptyQueueException;

    /**
     * Returns the number of elements in the queue
     *
     * @return
     */
    public int size();

    /**
     * Verifies if the queue is empty
     * @return
     */
    public boolean isEmpty();

    /**
     * Removes every element from the queue
     */
    public void clear();
}
