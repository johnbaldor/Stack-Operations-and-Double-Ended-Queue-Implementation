/*
 * Examples.java
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Examples {

    public List<String> EMPTY_LIST;
    public List<String> LIST1;
    private IDeque<Integer> deque;

    public Examples() {
        EMPTY_LIST = Collections.emptyList();
        LIST1 = new ArrayList<>();
    }

    @Before
    public void setUp() {
        deque = new ArrayDeque<>(10);
    }

    @Test
    public void testConstructor() {
        IDeque<String> deque = new ArrayDeque<>(10);
        assertEquals(EMPTY_LIST.toString(), deque.toString());
        assertEquals(0, deque.length());
    }

    @Test
    public void testInjectEmptyDeque() {
        deque.inject(1);
        assertEquals(1, deque.length());
        assertEquals(Integer.valueOf(1), deque.peek());
    }


    @Test
    public void testDequeueOneElement() {
        deque.enqueue(1);
        Integer item = deque.dequeue();
        assertEquals(Integer.valueOf(1), item);
        assertEquals(0, deque.length());
    }

    @Test
    public void testDequeueMoreThanOneElement() {
        deque.enqueue(1);
        deque.enqueue(2);
        Integer item = deque.dequeue();
        assertEquals(Integer.valueOf(1), item);
        assertEquals(1, deque.length());
        assertEquals(Integer.valueOf(2), deque.peek());
    }

    @Test
    public void testInjectNonEmptyDeque() {
        deque.enqueue(2);
        deque.inject(1);
        assertEquals(2, deque.length());
        assertEquals(Integer.valueOf(1), deque.peek());
    }

    @Test
    public void testRemoveLastOneElement() {
        deque.enqueue(1);
        Integer item = deque.removeLast();
        assertEquals(Integer.valueOf(1), item);
        assertEquals(0, deque.length());
    }

    @Test
    public void testEnqueueEmptyDeque() {
        deque.enqueue(1);
        assertEquals(1, deque.length());
        assertEquals(Integer.valueOf(1), deque.peek());
    }

    @Test
    public void testEnqueueNonEmptyDeque() {
        deque.enqueue(1);
        deque.enqueue(2);
        assertEquals(2, deque.length());
        assertEquals(Integer.valueOf(2), deque.endOfDeque());
    }



    @Test
    public void testPeekMoreThanOneElement() {
        deque.enqueue(1);
        deque.enqueue(2);
        assertEquals(Integer.valueOf(1), deque.peek());
        assertEquals(2, deque.length());
    }
    @Test
    public void testPeekOneElement() {
        deque.enqueue(1);
        assertEquals(Integer.valueOf(1), deque.peek());
        assertEquals(1, deque.length());
    }

    @Test
    public void testEndOfDequeMoreThanOneElement() {
        deque.enqueue(1);
        deque.enqueue(2);
        assertEquals(Integer.valueOf(2), deque.endOfDeque());
        assertEquals(2, deque.length());
    }

    @Test
    public void testLengthEmptyDeque() {
        assertEquals(0, deque.length());
    }

    @Test
    public void testEndOfDequeOneElement() {
        deque.enqueue(1);
        assertEquals(Integer.valueOf(1), deque.endOfDeque());
        assertEquals(1, deque.length());
    }

    @Test
    public void testRemoveLastMoreThanOneElement() {
        deque.enqueue(1);
        deque.enqueue(2);
        Integer item = deque.removeLast();
        assertEquals(Integer.valueOf(2), item);
        assertEquals(1, deque.length());
        assertEquals(Integer.valueOf(1), deque.endOfDeque());
    }
    @Test
    public void testClearNonEmptyDeque() {
        deque.enqueue(1);
        deque.enqueue(2);
        deque.clear();
        assertEquals(0, deque.length());
    }

    @Test
    public void testLengthNonEmptyDeque() {
        deque.enqueue(1);
        deque.enqueue(2);
        assertEquals(2, deque.length());
    }

    @Test
    public void testClearEmptyDeque() {
        deque.clear();
        assertEquals(0, deque.length());
    }


}
