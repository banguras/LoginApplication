package DataStructures.Class;

import DataStructures.Exceptions.StackOverflowException;
import DataStructures.Exceptions.StackUnderflowException;
import DataStructures.Interfaces.UnboundedStackInterface;

import java.io.Serializable;

/**
 * Created by bangu on 6/16/2017.
 */
public class UnboundedStack<T> implements UnboundedStackInterface<T>, Serializable {
    protected T[] elements;
    protected int topIndex = -1;
    protected int cap = 0;


    public UnboundedStack() {
        elements = (T[]) new Object[cap];
    }

    public void push(T element) {
        cap++;
        T[] tmp = (T[]) new Object[cap];
        System.arraycopy(elements, 0, tmp, 0, cap-1);
        topIndex++;
        tmp[topIndex] = element;
        elements = tmp;
    }


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

    public T top() {
        T topOfStack = null;
        if (isEmpty())
            throw new StackUnderflowException("Top attempted on an empty stack.");
        else
            topOfStack = elements[topIndex];
        return topOfStack;
    }

    public boolean isEmpty() {
        return (topIndex == -1);
    }


    @Override
    public int size() {
        return topIndex + 1;
    }
}
