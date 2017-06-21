package DataStructures.Class;
import DataStructures.Interfaces.*;
import DataStructures.Exceptions.*;

import java.io.Serializable;


/**
 * Created by bangu on 6/12/2017.
 */
public class UnboundedQueue<T> implements UnboundedQueueInterface<T>, Serializable {
    protected final int defaultcap = 1;
    protected T[] elements;
    protected int origCap;
    protected int numElements = 0;
    protected int front = 0;
    protected int rear;

    //creates the unded queue constructor and instantiates bounded queue
    public UnboundedQueue() {
        elements = (T[]) new Object[defaultcap];
        rear = defaultcap - 1;
        origCap = defaultcap;
    }

    //enlarge method to create a bigger array if array is full
    private void enlarge() {
        T[] larger = (T[]) new Object[elements.length + origCap];
        int currSmaller = front;
        for (int currLarger = 0; currLarger < numElements; currLarger++) {
            larger[currLarger] = elements[currSmaller];
            currSmaller = (currSmaller + 1) % elements.length;
        }

        elements = larger;
        System.out.println("Created larger queue");
        front = 0;
        rear = numElements - 1;

    }

    //creates enqueue method to add a user and calls enlarge method if full
    public void enqueue(T element) {
        if (numElements == elements.length)
            enlarge();

        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        numElements = numElements + 1;
    }

    //checks to see if user is unique before adding the user
    public boolean isUnique(T userElement) {
        if (isEmpty()) {
            return true;
        } else {

            for (int i = 0; i < numElements; i++) {
                if (elements[i].equals(userElement)) {
                    return false;
                }
            }
        }
        return true;
    }

    //dequeue method to remove and returns element
    public T dequeue() {
        if (isEmpty())
            throw new QueueUnderflowException();
        else {
            T toReturn = elements[front];
            elements[front] = null;
            front = (front + 1) % elements.length;
            numElements = numElements - 1;
            return toReturn;
        }
    }

    //checks to see if empty
    public boolean isEmpty()
    {
        return (numElements == 0);
    }

    //checks the size of the array
    public int size()
    {
        return numElements;
    }
}

