package DataStructures.Test;

import DataStructures.Class.BoundedQueue;
import DataStructures.Class.BoundedStack;
import DataStructures.Class.UnboundedQueue;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bangu on 6/17/2017.
 */
public class BoundedQueueTest {

    //create UserTest u
    UserTest u = new UserTest("123","Trung");

    //test enqueue function to add users
    @Test
    public void enqueue() throws Exception {
        BoundedQueue<UserTest> bs = new BoundedQueue<>(1);
        bs.enqueue(u);
        assertEquals(1, bs.size());
    }

    //test if user is Unique
    @Test
    public void isUnique() throws Exception {
        BoundedQueue<UserTest> uq = new BoundedQueue<>(1);
        assertEquals(true, uq.isUnique(u));
    }

    //test dequeue method to remove users
    @Test
    public void dequeue() throws Exception {
        BoundedQueue<UserTest> uq = new BoundedQueue<>(1);
        uq.enqueue(u);
        UserTest ut = uq.dequeue();
        assertEquals(0, uq.size());
    }

    //test isEmpty function
    @Test
    public void isEmpty() throws Exception {
        BoundedQueue<UserTest> uq = new BoundedQueue<>(1);
        uq.enqueue(u);
        uq.dequeue();
        assertEquals(0, uq.size());
    }

    //checks to see if the array is full
    @Test
    public void isFull() throws Exception {
        BoundedQueue<UserTest> uq = new BoundedQueue<>(1);
        uq.enqueue(u);
        assertEquals(1, uq.size());
    }

    //test array size function
    @Test
    public void size() throws Exception {
        BoundedQueue<UserTest> uq = new BoundedQueue<>(1);
        uq.enqueue(u);
        assertEquals(1, uq.size());
    }

}