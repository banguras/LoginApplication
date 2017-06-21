package DataStructures.Interfaces;

/**
 * Created by bangu on 6/18/2017.
 */
public interface OrderedListInterface<T extends Comparable<T>> extends IndexedListInterface<T> {

    //sort method function
    public void sort();
}
