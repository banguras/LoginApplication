package DataStructures.Class;

import DataStructures.Exceptions.OutofRangeException;
import DataStructures.Interfaces.OrderedListInterface;

/**
 * Created by bangu on 6/17/2017.
 */
public class OrderedList<T extends Comparable<T>> implements OrderedListInterface<T>{
    private int cap;
    private T[] elements;
    private int index;

    //method to instantiate the orderedlist
    public OrderedList() {
        cap = 0;
        elements = (T[]) (new Comparable[cap]);
        index = -1;
    }


    //method to add user using the element
    public void add(T element) throws OutofRangeException {
        if (isUnique(element)) {
            cap++;
            T[] tmp = (T[]) new Comparable[cap];
            System.arraycopy(elements, 0, tmp, 0, cap-1);
            index++;
            tmp[index] = element;
            elements = tmp;
            sort();
        }
    }

    //method to remove the user from the array using the index
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
            sort();
        }
    }

    //method to remove the user from the array using an element
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
            sort();
        }
    }

    //checks to see if contains element
    @Override
    public boolean contains(T element) {
        for (int i = 0; i < size(); i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    //checks to see if the element is empty
    @Override
    public boolean isEmpty() throws OutofRangeException {
        return (size() == 0);
    }

    //returns the size of the element
    @Override
    public int size() {
        return index + 1;
    }

    //gets the element using the index
    @Override
    public T get(int i) throws OutofRangeException {
        if(contains(elements[i]))
            return elements[i];
        else
            throw new OutofRangeException();
    }

    //toSting method
    @Override
    public String toSting() {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            tmp.append(elements[i].toString());
            tmp.append("\n");
        }
        return tmp.toString();
    }

    //methods to reset the array
    @Override
    public void reset() {
        cap = 0;
        T[] elements = (T[]) new Comparable[cap];
        index = -1;
    }

    //method to get the next element using the index
    @Override
    public T getNext(int i) throws OutofRangeException {
        if(contains(elements[i + 1]))
            return elements[i + 1];
        else
            throw new OutofRangeException();
    }

    //method to get the next element using an element
    @Override
    public T getNext(T element) throws OutofRangeException {
        if (indexOf(element) == -1) {
            throw new OutofRangeException("Index is out of bounds");
        } else
            return elements[indexOf(element)];
    }

    //method to get the index of an element
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

    //method to check if the user is unique
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

    //method to sort the array
    @Override
    public void sort() {
        for (int i = index; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (elements[j].compareTo(elements[j+1]) < 0) {
                    T tmp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = tmp;
                }

            }
        }
    }

}
