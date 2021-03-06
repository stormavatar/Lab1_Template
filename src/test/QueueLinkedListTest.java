package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pt.pa.adts.EmptyQueueException;
import pt.pa.adts.QueueLinkedList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueLinkedListTest {

    private QueueLinkedList<Integer> queue;

    @BeforeEach
    void setUp() {

        queue = new QueueLinkedList<>();
    }

    @Test
    void enqueue() {

        queue.enqueue(1);
        assertEquals(1, queue.front());

    }

    @Test
    void dequeue() {


        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(1, queue.dequeue());
    }

    @Test
    void dequeueException(){
        assertThrows(EmptyQueueException.class, () -> {
            queue.dequeue();
        });
    }

    @Test
    void front() {


        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(1, queue.front());

        queue.dequeue();
        assertEquals(2, queue.front());
    }

    @Test
    void frontException() {

        assertThrows(EmptyQueueException.class, () -> {
            queue.front();
        });
    }

    @Test
    void size() {

        assertEquals(0, queue.size());

        queue.enqueue(1);
        assertEquals(1, queue.size());

        queue.enqueue(2);
        assertEquals(2, queue.size());

        queue.enqueue(3);
        assertEquals(3, queue.size());

        queue.dequeue();
        assertEquals(2, queue.size());
    }

    @Test
    void isEmpty() {


        assertEquals(true, queue.isEmpty());
        queue.enqueue(1);
        assertEquals(false, queue.isEmpty());
        queue.dequeue();
        assertEquals(true, queue.isEmpty());
    }

    @Test
    void clear() {


        assertEquals(0, queue.size());

        queue.enqueue(1);
        assertEquals(1, queue.size());

        queue.enqueue(2);
        assertEquals(2, queue.size());

        queue.enqueue(3);
        assertEquals(3, queue.size());

        queue.clear();
        assertEquals(0, queue.size());
    }
}