package DataStructures.Interfaces;

import DataStructures.Exceptions.OutofRangeException;

/**
 * Created by bangu on 6/17/2017.
 */
public interface IndexedListInterface<T extends Comparable<T>> {

    //add user function
    public void add(T element) throws OutofRangeException;

    //remove user function
    public void remove(int index) throws OutofRangeException;

    public void remove(T index) throws OutofRangeException;

    public boolean contains(T element);

    public boolean isEmpty() throws OutofRangeException;

    public int size();

    public T get(int index) throws OutofRangeException;

    public String toSting();

    public void reset();

    public T getNext(int index) throws OutofRangeException;

    public T getNext(T element) throws OutofRangeException;

    public int indexOf(T element) throws OutofRangeException;

    public boolean isUnique(T element) throws OutofRangeException;

}