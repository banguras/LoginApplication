package DataStructures.Class;
import DataStructures.Interfaces.UnboundedStackInterface;
import DataStructures.Exceptions.*;

import java.io.Serializable;

/**
 * Created by bangu on 6/11/2017.
 */
public class BoundedStack<T> implements UnboundedStackInterface<T>, Serializable {
    protected final int cap = 5;
    protected T[] elements;
    protected int topIndex = -1;

    //instantiates the bounded stack array
    public BoundedStack() {
        elements = (T[]) new Object[cap];
    }

    //instantiates the bounded stackk array with a max size
    public BoundedStack(int maxSize) {
        elements = (T[]) new Object[maxSize];
    }

    //push method to add user to array
    public void push(T element) {
        if (isFull())
            throw new StackOverflowException("Push attempted on a full stack.");
        else {
            topIndex++;
            elements[topIndex] = element;
        }
    }

    //pop method remove an element
    public T pop() {
        if (isEmpty())
            throw new StackUnderflowException("Pop attempted on an empty stack.");
        else {
            T tmp = elements[topIndex];
            elements[topIndex] = null;
            topIndex--;
            return tmp;
        }
    }

    //top method to return the top element
    public T top() {
        T topOfStack = null;
        if (isEmpty())
            throw new StackUnderflowException("Top attempted on an empty stack.");
        else
            topOfStack = elements[topIndex];
        return topOfStack;
    }

    //method to check if array is empty
    public boolean isEmpty() {
        return (topIndex == -1);
    }

    //method to check if array is full
    public boolean isFull() {
        return (topIndex == (elements.length - 1));
    }

    //method to return the array size
    @Override
    public int size() {
        return topIndex +1;
    }
}

