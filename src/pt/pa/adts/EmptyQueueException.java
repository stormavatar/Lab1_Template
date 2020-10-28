package pt.pa.adts;

public class EmptyQueueException extends RuntimeException {

    public EmptyQueueException(){
        super("The Queue is empty");
    }

    public EmptyQueueException(String message) {
        super(message);
    }
}
