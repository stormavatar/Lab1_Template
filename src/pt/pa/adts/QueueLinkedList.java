package pt.pa.adts;

public class QueueLinkedList<T> implements Queue<T> {

    private Node header, trailer;
    private int size;

    public QueueLinkedList(){

        this.header = new Node(null,null, null);
        this.trailer = new Node(null,null, null);

        header.next = trailer;
        trailer.prev = header;

        this.size = 0;
    }

    @Override
    public void enqueue(T element) throws FullQueueException {

        try {
            Node curEnd = trailer.prev;
            Node newEnd = new Node(element, trailer, curEnd);

            trailer.prev = newEnd;
            curEnd.next = newEnd;

            this.size++;


        }catch (Exception e ){
            throw new FullQueueException("Full queue");
        }
    }

    @Override
    public T dequeue()  throws EmptyQueueException {

        if(this.isEmpty()) {
            //return null;
            throw new EmptyQueueException();
        }

        Node curFront = header.next;
        Node newFront = curFront.next;

        //Node newNode = this.header;
        //this.header = this.header.next;
        this.header.next = newFront;
        newFront.prev = header;

        this.size--;

        return curFront.element;
    }

    @Override
    public T front() throws EmptyQueueException {

        if(this.header == null) {

           throw new EmptyQueueException();

        }else{

            return this.header.next.element;

        }
    }

    @Override
    public int size() {

        return this.size;
        /*int counter = 0;
        Node current = trailer.next;
        while(current != null){
            counter++;
            current= current.next;
        }
        return counter;*/
    }

    @Override
    public boolean isEmpty() {

        return (size() == 0);
    }

    @Override
    public void clear() {
        /*trailer.element = null;
        trailer.next = null;

        header.next = null;
        header.element = null;*/

        header.next = trailer;
        trailer.prev = header;

        size = 0;
    }

    private class Node {
        private T element;
        private Node next;
        private Node prev;

        public Node(T element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
