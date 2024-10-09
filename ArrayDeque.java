/*
 * ArrayDeque.java
 *
 * Author: Your Name
 * Submitted on: Insert Date
 *
 * Academic Honesty Declaration:
 *
 * The following code represents my own work and I have neither received nor given assistance
 * that violates the collaboration policy posted with this assignment. I have not copied or modified code
 * from any other source other than the homework assignment, course textbook, or course lecture slides.
 * Any unauthorized collaboration or use of materials not permitted will be subjected to academic integrity policies of
 * WPI and CS 2223.
 *
 * I acknowledge that this homework assignment is based upon an assignment created by WPI and that any publishing or
 * posting of this code is prohibited unless I receive written permission from WPI.
 */
package wpialgs.hw01;

/**
 * <p>
 * An array implementation of {@link IDeque}.
 * </p>
 *
 * @version 1.0
 */
public class ArrayDeque<E> extends AbsDeque<E> implements IDeque<E> {

    private final E[] myQ;
    private int myLength;

    /**
     * <p>
     * This creates a new array-based deque that is initially empty.
     * </p>
     *
     * @param capacity
     *            Maximum number of elements that can be stored in this deque.
     */
    @SuppressWarnings("unchecked")
    public ArrayDeque(int capacity) {
        myQ = (E[]) new Object[capacity];
        myLength = 0;
    }

    @Override
    public void enqueue(E item) {
        if (myLength == myQ.length) {
            throw new IllegalStateException("Deque is full");
        }
        myQ[myLength] = item;
        myLength++;
    }

    @Override
    public E dequeue() {
        if (myLength == 0) {
            throw new IllegalStateException("Deque is empty");
        }
        E item = myQ[0];
        for (int i = 1; i < myLength; i++) {
            myQ[i - 1] = myQ[i];
        }
        myQ[myLength - 1] = null;
        myLength--;
        return item;
    }

    @Override
    public void inject(E item) {
        if (myLength == myQ.length) {
            throw new IllegalStateException("Deque is full");
        }
        for (int i = myLength; i > 0; i--) {
            myQ[i] = myQ[i - 1];
        }
        myQ[0] = item;
        myLength++;
    }

    @Override
    public E removeLast() {
        if (myLength == 0) {
            throw new IllegalStateException("Deque is empty");
        }
        E item = myQ[myLength - 1];
        myQ[myLength - 1] = null;
        myLength--;
        return item;
    }

    @Override
    public E peek() {
        if (myLength == 0) {
            throw new IllegalStateException("Deque is empty");
        }
        return myQ[0];
    }

    @Override
    public E endOfDeque() {
        if (myLength == 0) {
            throw new IllegalStateException("Deque is empty");
        }
        return myQ[myLength - 1];
    }

    @Override
    public int length() {
        return myLength;
    }

    @Override
    public void clear() {
        for (int i = 0; i < myQ.length; i++) {
            myQ[i] = null;
        }
        myLength = 0;
    }
}
