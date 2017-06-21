package DataStructures.Interfaces;
import DataStructures.Exceptions.*;

/**
 * Created by bangu on 6/11/2017.
 */
public interface UnboundedStackInterface<T> {

    //add user function
    public void push(T element) throws StackOverflowException;

    //remove user function
    public T pop() throws StackUnderflowException;

    //return top element function
    public T top() throws StackUnderflowException;

    //returns true or false if the array is empty
    public boolean isEmpty();

    //checks the size of the array
    public int size();

    //toSting function
    public String toString();

}