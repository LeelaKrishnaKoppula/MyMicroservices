package patel.msf.myexceptions;

public class ResourceAlreadyExistsException extends Exception {
 
    public ResourceAlreadyExistsException() {
    }
 
    public ResourceAlreadyExistsException(String msg) {
        super(msg);
    }

}
