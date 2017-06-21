package DataStructures.Interfaces;

/**
 * Created by bangu on 6/17/2017.
 */
public interface BoundedQueueInterface<T> extends UnboundedQueueInterface<T> {

    //boolean which returns if the array is full
    public boolean isFull();

}
