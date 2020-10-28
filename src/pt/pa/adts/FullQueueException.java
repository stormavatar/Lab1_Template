package pt.pa.adts;

public class FullQueueException extends RuntimeException {

    public FullQueueException(){
        super("The Queue is full.");
    }

    public FullQueueException(String message){
        super(message);
    }
}
