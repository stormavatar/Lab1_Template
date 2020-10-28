package pt.pa.adts;

public class NullNotAllowedException extends RuntimeException {

    public NullNotAllowedException (){
        super("Null not allowed");
    }

    public NullNotAllowedException(String message) {
        super(message);
    }
}
