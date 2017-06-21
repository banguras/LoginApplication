package DataStructures.Exceptions;

/**
 * Created by bangu on 6/11/2017.
 */
public class QueueOverflowException extends RuntimeException
{
    //Overflow function when trying to add elements to an array that's full
    public QueueOverflowException()
    {
        super();
    }

    //Overflow function when trying to add elements to an array that's full with ability to add a message
    public QueueOverflowException(String message)
    {
        super(message);
    }
}
