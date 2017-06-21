package DataStructures.Class;

import DataStructures.Exceptions.OutofRangeException;
import DataStructures.Interfaces.IndexedListInterface;

/**
 * Created by bangu on 6/17/2017.
 */
public class IndexedList<T extends Comparable<T>> implements IndexedListInterface<T> {

    private int cap;
    private T[] elements;
    private int index;

    public IndexedList() {
        cap = 0;
        elements = (T[]) new Comparable[cap];
        index = -1;
    }



    public void add(T element) throws OutofRangeException {
        if (isUnique(element)) {
            cap++;
            T[] tmp = (T[]) new Comparable[cap];
            System.arraycopy(elements, 0, tmp, 0, cap-1);
            index++;
            tmp[index] = element;
            elements = tmp;
        }
    }

    @Override
    public void remove(int i) throws OutofRangeException {
        if (isEmpty()) {
            throw new OutofRangeException("There are no elements in the list");
        }
        else {
            T[] tmp = (T[]) new Comparable[index];
            System.arraycopy(elements, 0, tmp, 0, i-1);
            System.arraycopy(elements, index+1, tmp, i, index-i);
            index--;
            elements = tmp;
        }
    }

    @Override
    public void remove(T element) throws OutofRangeException {
        if (isEmpty()) {
            throw new OutofRangeException("There are no elements in the list");
        }
        else {
            int tmpI = indexOf(element);
            T[] tmp = (T[]) new Comparable[index];
            if(index != 0) {
                System.arraycopy(elements, 0, tmp, 0, tmpI-1);
                System.arraycopy(elements, index+1, tmp, tmpI, index-tmpI);
            }
            index--;
            elements = tmp;
        }
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < size(); i++) {
            if (elements[i].equals(element)) {
               return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() throws OutofRangeException {
        return (size() == 0);
    }

    @Override
    public int size() {
        return index + 1;
    }

    //method to
    @Override
    public T get(int i) throws OutofRangeException {
        if(contains(elements[i]))
            return elements[i];
        else
            throw new OutofRangeException();
    }

    //toString function
    @Override
    public String toSting() {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            tmp.append(elements[i].toString());
            tmp.append("\n");
        }
        return tmp.toString();
    }

    //resets the array
    @Override
    public void reset() {
        cap = 0;
        T[] elements = (T[]) new Comparable[cap];
        index = -1;
    }

    //gets the next element using the index and returns it
    @Override
    public T getNext(int i) throws OutofRangeException {
        if(contains(elements[i + 1]))
            return elements[i + 1];
        else
            throw new OutofRangeException();
    }

    //gets the next element using the element and returns it
    @Override
    public T getNext(T element) throws OutofRangeException {
        if (indexOf(element) == -1) {
            throw new OutofRangeException("Index is out of bounds");
        } else
            return elements[indexOf(element)];
    }

    //gets the index of an element
    @Override
    public int indexOf(T element) throws OutofRangeException {
        int tmpI = -1;
        for (int i = 0; i < size(); i++) {
            if (elements[i].equals(element)) {
                tmpI = i;
            }
        }
        return tmpI;
    }

    //checks to see if the element before adding it
    @Override
    public boolean isUnique(T userElement) throws OutofRangeException {
        if (isEmpty()) {
            return true;
        } else {
            for (int i = 0; i < size(); i++) {
                if (elements[i].equals(userElement)) {
                    return false;
                }
            }
        }
        return true;
    }
}
