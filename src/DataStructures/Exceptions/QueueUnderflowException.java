package DataStructures.Exceptions;

/**
 * Created by bangu on 6/11/2017.
 */
public class QueueUnderflowException extends RuntimeException
{
    //Underflow exception to check if array is empty
    public QueueUnderflowException()
    {
        super();
    }

    //Underflow exception to check if array is empty with ability to add a message
    public QueueUnderflowException(String message)
    {
        super(message);
    }
}
