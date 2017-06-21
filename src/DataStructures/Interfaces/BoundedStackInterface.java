package DataStructures.Interfaces;

/**
 * Created by bangu on 6/16/2017.
 */
public interface BoundedStackInterface<T> extends UnboundedStackInterface<T> {

    //boolean to check if the array is full
    public boolean isFull();
}
