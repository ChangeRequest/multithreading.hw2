package school.lemon.changerequest.java.multithreading.hw2.task1;

public interface ElementsHolder<E> {

    /**
     * Add element at the end of the holder.
     * @param element to be added.
     */
    void add(E element);

    /**
     * Remove element from the holder on specified index.
     * @param index of element, that should be removed.
     * @return element which was removed.
     * @throws IndexOutOfBoundsException if there is no element at specified index.
     */
    E remove(int index) throws IndexOutOfBoundsException;

    /**
     * Get element at specified index.
     * @param index of element.
     * @return element.
     */
    E get(int index);

    /**
     * Get first element.
     * @return first element.
     */
    E getFirst();

    /**
     * Get last element.
     * @return last element.
     */
    E getLast();

    /**
     * Get current amount of elements.
     * @return current amount of elements.
     */
    int size();

}
