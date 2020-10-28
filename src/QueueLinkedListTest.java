import org.junit.jupiter.api.BeforeEach;
import pt.pa.adts.QueueLinkedList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueLinkedListTest {

    private QueueLinkedList<Integer> queue;

    @BeforeEach
    void setUp() {

        queue = new QueueLinkedList<>();
    }

    @org.junit.jupiter.api.Test
    void enqueue() {

        queue.enqueue(1);
        assertEquals(1, queue.front());

    }

    @org.junit.jupiter.api.Test
    void dequeue() {


        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(1, queue.dequeue());
    }

    @org.junit.jupiter.api.Test
    void front() {


        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(1, queue.front());

        queue.dequeue();
        assertEquals(2, queue.front());
    }

    @org.junit.jupiter.api.Test
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

    @org.junit.jupiter.api.Test
    void isEmpty() {


        assertEquals(true, queue.isEmpty());
        queue.enqueue(1);
        assertEquals(false, queue.isEmpty());
        queue.dequeue();
        assertEquals(true, queue.isEmpty());
    }

    @org.junit.jupiter.api.Test
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