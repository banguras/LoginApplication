package DataStructures.Interfaces;
import  DataStructures.Exceptions.*;

import java.io.Serializable;

/**
 * Created by bangu on 6/11/2017.
 */
public interface UnboundedQueueInterface<T>
{
    //add user function
    void enqueue(T element) throws QueueOverflowException;

    //remove user and return the element function
    T dequeue() throws QueueUnderflowException;

    //checks to see if array is empty
    boolean isEmpty();

    //checks the size of the array
    int size();
}