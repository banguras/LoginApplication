package DataStructures.Exceptions;

/**
 * Created by bangu on 6/11/2017.
 */
public class StackUnderflowException extends RuntimeException
{
    //Underflow exception to check if array is empty
    public StackUnderflowException()
    {
        super();
    }

    //Underflow exception to check if array is empty with ability to add a message
    public StackUnderflowException(String message)
    {
        super(message);
    }
}