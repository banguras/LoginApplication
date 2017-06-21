package DataStructures.Exceptions;

/**
 * Created by bangu on 6/17/2017.
 */
public class OutofRangeException extends Exception{

    //OutofRangeException
    public OutofRangeException() {
        super();
    }

    //OutofRangeExecption with ability to add message
    public OutofRangeException(String message) {
        super(message);
    }
}
